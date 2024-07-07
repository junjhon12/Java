// Import FileWriter to write data to a file
import java.io.FileWriter;

// Import IOException to handle potential I/O errors
import java.io.IOException;

// Import ManagementFactory to access the platform's management interfaces
import java.lang.management.ManagementFactory;

// Import OperatingSystemMXBean to get system resource information
import java.lang.management.OperatingSystemMXBean;

// Import SimpleDateFormat to format date and time
import java.text.SimpleDateFormat;

// Import Date to get the current date and time
import java.util.Date;

// Import File to get file system partition information
import java.io.File;

public class SystemResourceMonitor {
    
    // Main method to start the resource monitor
    public static void main(String[] args) {
        // Create an instance of OperatingSystemMXBean to get system resource information
        OperatingSystemMXBean osBean = ManagementFactory.getOperatingSystemMXBean();
        
        // Create a SimpleDateFormat object to format the timestamp in 12-hour format with AM/PM
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm a");

        // Infinite loop to continuously monitor the system resources
        while (true) {
            // Get the current timestamp
            String timestamp = dateFormat.format(new Date());

            // Get the available processors (cores)
            int availableProcessors = osBean.getAvailableProcessors();
            
            // Get the system load average for the last minute
            double systemLoadAverage = osBean.getSystemLoadAverage();
            
            // Get the total memory in the Java Virtual Machine
            long totalMemoryBytes = Runtime.getRuntime().totalMemory();
            
            // Get the free memory in the Java Virtual Machine
            long freeMemoryBytes = Runtime.getRuntime().freeMemory();
            
            // Calculate the used memory
            long usedMemoryBytes = totalMemoryBytes - freeMemoryBytes;

            // Convert bytes to gigabytes
            double totalMemoryGB = totalMemoryBytes / (1024.0 * 1024 * 1024);
            double usedMemoryGB = usedMemoryBytes / (1024.0 * 1024 * 1024);
            double freeMemoryGB = freeMemoryBytes / (1024.0 * 1024 * 1024);

            // Log the system resource information to the console
            System.out.println("Timestamp: " + timestamp);
            System.out.println("Available Processors: " + availableProcessors);
            System.out.println("System Load Average: " + systemLoadAverage);
            System.out.println("Total Memory (GB): " + totalMemoryGB);
            System.out.println("Used Memory (GB): " + usedMemoryGB);
            System.out.println("Free Memory (GB): " + freeMemoryGB);

            // Get the list of all file system roots (partitions)
            File[] roots = File.listRoots();

            // Initialize a counter for drive numbering
            int driveNumber = 1;
            
            // Log the storage information for each partition
            for (File root : roots) {
                long totalSpaceBytes = root.getTotalSpace();
                long freeSpaceBytes = root.getFreeSpace();
                long usableSpaceBytes = root.getUsableSpace();

                // Convert bytes to gigabytes
                double totalSpaceGB = totalSpaceBytes / (1024.0 * 1024 * 1024);
                double freeSpaceGB = freeSpaceBytes / (1024.0 * 1024 * 1024);
                double usableSpaceGB = usableSpaceBytes / (1024.0 * 1024 * 1024);

                System.out.println("Drive " + driveNumber + ": " + root.getAbsolutePath());
                System.out.println("Total Space (GB): " + totalSpaceGB);
                System.out.println("Free Space (GB): " + freeSpaceGB);
                System.out.println("Usable Space (GB): " + usableSpaceGB);
                driveNumber++;
            }

            // Log the system resource information to a file
            try (FileWriter fileWriter = new FileWriter("system_resources.log", true)) {
                fileWriter.write("Timestamp: " + timestamp + "\n");
                fileWriter.write("Available Processors: " + availableProcessors + "\n");
                fileWriter.write("System Load Average: " + systemLoadAverage + "\n");
                fileWriter.write("Total Memory (GB): " + totalMemoryGB + "\n");
                fileWriter.write("Used Memory (GB): " + usedMemoryGB + "\n");
                fileWriter.write("Free Memory (GB): " + freeMemoryGB + "\n");
                
                // Log the storage information for each partition
                for (File root : roots) {
                    long totalSpaceBytes = root.getTotalSpace();
                    long freeSpaceBytes = root.getFreeSpace();
                    long usableSpaceBytes = root.getUsableSpace();

                    // Convert bytes to gigabytes
                    double totalSpaceGB = totalSpaceBytes / (1024.0 * 1024 * 1024);
                    double freeSpaceGB = freeSpaceBytes / (1024.0 * 1024 * 1024);
                    double usableSpaceGB = usableSpaceBytes / (1024.0 * 1024 * 1024);

                    fileWriter.write("Drive " + driveNumber + ": " + root.getAbsolutePath() + "\n");
                    fileWriter.write("Total Space (GB): " + totalSpaceGB + "\n");
                    fileWriter.write("Free Space (GB): " + freeSpaceGB + "\n");
                    fileWriter.write("Usable Space (GB): " + usableSpaceGB + "\n");
                }
                fileWriter.write("\n");
            } catch (IOException e) {
                e.printStackTrace();
            }

            // Sleep for 10 seconds before the next iteration
            try {
                Thread.sleep(10000); // 10 seconds
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

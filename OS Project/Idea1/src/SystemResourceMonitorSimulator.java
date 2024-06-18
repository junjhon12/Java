import java.lang.management.ManagementFactory;
import com.sun.management.OperatingSystemMXBean;

public class SystemResourceMonitorSimulator {

    public static void main(String[] args) throws InterruptedException {
        while (true) {
            SystemResourceMonitor monitor = new SystemResourceMonitor();

            // Simulate monitoring and displaying system resources
            monitor.outputInfo();

            Thread.sleep(1000); // Sleep for 1 second before updating again
        }
    }
}

class SystemResourceMonitor {
    // Method to retrieve CPU usage as a percentage
    private double getCPUUsage() {
        OperatingSystemMXBean osBean = (com.sun.management.OperatingSystemMXBean) ManagementFactory.getOperatingSystemMXBean();
        return osBean.getSystemCpuLoad() * 100;
    }

    // Method to retrieve memory usage statistics
    private long[] getMemoryUsage() {
        Runtime runtime = Runtime.getRuntime();
        long totalMemory = runtime.totalMemory();
        long freeMemory = runtime.freeMemory();
        long usedMemory = totalMemory - freeMemory;
        return new long[] { totalMemory, usedMemory };
    }

    // Dummy method for simulating disk reads
    private long getDiskReads() {
        return (long) (Math.random() * 1000); // Example: Random value for demo purposes
    }

    // Dummy method for simulating disk writes
    private long getDiskWrites() {
        return (long) (Math.random() * 500); // Example: Random value for demo purposes
    }

    // Method to monitor and display system resources
    public void outputInfo() {
        // Get CPU usage
        double cpuUsage = getCPUUsage();

        // Get memory usage
        long[] memoryUsage = getMemoryUsage();
        long totalMemory = memoryUsage[0];
        long usedMemory = memoryUsage[1];

        // Get disk activity (dummy example)
        long diskReads = getDiskReads();
        long diskWrites = getDiskWrites();

        // Display information
        System.out.println("CPU Usage: " + cpuUsage + "%");
        System.out.println("Memory Usage: " + usedMemory + " / " + totalMemory + " bytes");
        System.out.println("Disk Activity: Reads=" + diskReads + ", Writes=" + diskWrites);
        System.out.println();
    }
}

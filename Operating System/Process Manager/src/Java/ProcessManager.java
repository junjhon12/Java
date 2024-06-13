package Java;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ProcessManager {

    // Method to list processes based on the operating system
    public void listProcesses() {
        // Determine the operating system
        String os = System.getProperty("os.name").toLowerCase();
        
        // Call the appropriate method based on the OS
        if (os.contains("win")) {
            listProcessesWindows();
        } else {
            listProcessesUnix();
        }
    }

    // Method to list processes on Windows
    private void listProcessesWindows() {
        try {
            // Execute the tasklist command to get the list of processes
            Process process = Runtime.getRuntime().exec("tasklist");
            
            // Read the output of the command
            try (BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()))) {
                String line;
                
                // Print the header for the output
                System.out.printf("%-30s %-10s %-10s%n", "Process Name", "PID", "Memory Usage");
                
                // Print each line of the output
                while ((line = reader.readLine()) != null) {
                    System.out.println(line);
                }
            }
        } catch (IOException e) {
            // Print the stack trace if an exception occurs
            e.printStackTrace();
        }
    }

    // Method to list processes on Unix-based systems
    private void listProcessesUnix() {
        try {
            // Use the ps command to get the list of processes
            ProcessBuilder processBuilder = new ProcessBuilder("ps", "-eo", "pid,comm,pcpu,pmem,etime");
            processBuilder.redirectErrorStream(true);
            
            // Start the process
            Process process = processBuilder.start();
            
            // Read the output of the command
            try (BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()))) {
                String line;
                
                // Print the header for the output
                System.out.printf("%-10s %-30s %-10s %-10s %-10s%n", "PID", "Command", "CPU %", "Memory %", "Elapsed Time");
                
                // Print each line of the output
                while ((line = reader.readLine()) != null) {
                    System.out.println(line);
                }
            }
        } catch (IOException e) {
            // Print the stack trace if an exception occurs
            e.printStackTrace();
        }
    }
}

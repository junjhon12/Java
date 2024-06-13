import java.lang.management.ManagementFactory;
import java.lang.management.OperatingSystemMXBean;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Timer;
import java.util.TimerTask;
import java.nio.file.*;
import java.awt.*;
import java.awt.geom.*;
import javax.swing.*;
import java.util.ArrayList;

// Main class to monitor system resources
public class SystemResourceMonitor {

    // Log file to store historical data
    private static final String LOG_FILE = "system_resource_log.txt";
    // Duration to log data (in milliseconds)
    private static final long LOG_INTERVAL = 1000;

    public static void main(String[] args) {
        // Schedule the resource monitoring task at fixed intervals
        Timer timer = new Timer();
        timer.schedule(new MonitorTask(), 0, LOG_INTERVAL);

        // Create and display the graph window
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("System Resource Monitor");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.add(new GraphPanel());
            frame.setSize(800, 600);
            frame.setVisible(true);
        });
    }

    // TimerTask to monitor and log system resources
    private static class MonitorTask extends TimerTask {
        private OperatingSystemMXBean osBean;

        public MonitorTask() {
            // Get the OperatingSystemMXBean instance to access system resource details
            osBean = ManagementFactory.getOperatingSystemMXBean();
        }

        @Override
        public void run() {
            // Get system resource details
            double cpuLoad = osBean.getSystemLoadAverage();
            long freeMemory = Runtime.getRuntime().freeMemory();
            long totalMemory = Runtime.getRuntime().totalMemory();
            long usedMemory = totalMemory - freeMemory;

            // Log the resource details to a file
            logResourceUsage(cpuLoad, usedMemory, totalMemory);
        }

        // Method to log the resource usage details to a file
        private void logResourceUsage(double cpuLoad, long usedMemory, long totalMemory) {
            try (FileWriter fileWriter = new FileWriter(LOG_FILE, true);
                 PrintWriter printWriter = new PrintWriter(fileWriter)) {
                printWriter.printf("%d,%.2f,%d,%d%n", System.currentTimeMillis(), cpuLoad, usedMemory, totalMemory);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    // JPanel class to display the resource usage graph
    private static class GraphPanel extends JPanel {
        private ArrayList<Double> cpuLoadHistory = new ArrayList<>();
        private ArrayList<Long> usedMemoryHistory = new ArrayList<>();
        private ArrayList<Long> totalMemoryHistory = new ArrayList<>();
        private static final int MAX_HISTORY_SIZE = 100;

        public GraphPanel() {
            // Timer to refresh the graph every second
            Timer timer = new Timer();
            timer.schedule(new TimerTask() {
                @Override
                public void run() {
                    loadHistoricalData();
                    repaint();
                }
            }, 0, LOG_INTERVAL);
        }

        // Method to load historical data from the log file
        private void loadHistoricalData() {
            cpuLoadHistory.clear();
            usedMemoryHistory.clear();
            totalMemoryHistory.clear();

            try {
                // Read all lines from the log file
                Files.lines(Paths.get(LOG_FILE)).forEach(line -> {
                    String[] parts = line.split(",");
                    if (parts.length == 4) {
                        cpuLoadHistory.add(Double.parseDouble(parts[1]));
                        usedMemoryHistory.add(Long.parseLong(parts[2]));
                        totalMemoryHistory.add(Long.parseLong(parts[3]));
                    }
                });
            } catch (IOException e) {
                e.printStackTrace();
            }

            // Trim history to max size
            if (cpuLoadHistory.size() > MAX_HISTORY_SIZE) {
                cpuLoadHistory = new ArrayList<>(cpuLoadHistory.subList(cpuLoadHistory.size() - MAX_HISTORY_SIZE, cpuLoadHistory.size()));
            }
            if (usedMemoryHistory.size() > MAX_HISTORY_SIZE) {
                usedMemoryHistory = new ArrayList<>(usedMemoryHistory.subList(usedMemoryHistory.size() - MAX_HISTORY_SIZE, usedMemoryHistory.size()));
            }
            if (totalMemoryHistory.size() > MAX_HISTORY_SIZE) {
                totalMemoryHistory = new ArrayList<>(totalMemoryHistory.subList(totalMemoryHistory.size() - MAX_HISTORY_SIZE, totalMemoryHistory.size()));
            }
        }

        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            Graphics2D g2d = (Graphics2D) g;

            // Draw CPU load graph
            drawGraph(g2d, cpuLoadHistory, Color.RED, 0, 100);

            // Draw memory usage graph
            drawGraph(g2d, usedMemoryHistory, Color.BLUE, 100, 200);
            drawGraph(g2d, totalMemoryHistory, Color.GREEN, 200, 300);
        }

        // Method to draw a graph on the panel
        private void drawGraph(Graphics2D g2d, ArrayList<? extends Number> history, Color color, int yOffset, int yScale) {
            g2d.setColor(color);
            int width = getWidth();
            int height = getHeight();

            // Calculate the scaling factor for the graph
            double xScale = (double) width / (MAX_HISTORY_SIZE - 1);
            double maxValue = history.stream().mapToDouble(Number::doubleValue).max().orElse(1);
            double minValue = history.stream().mapToDouble(Number::doubleValue).min().orElse(0);
            double valueRange = maxValue - minValue;

            // Draw the graph lines
            for (int i = 1; i < history.size(); i++) {
                int x1 = (int) ((i - 1) * xScale);
                int y1 = height - (int) ((history.get(i - 1).doubleValue() - minValue) / valueRange * height / yScale) - yOffset;
                int x2 = (int) (i * xScale);
                int y2 = height - (int) ((history.get(i).doubleValue() - minValue) / valueRange * height / yScale) - yOffset;
                g2d.drawLine(x1, y1, x2, y2);
            }
        }
    }
}

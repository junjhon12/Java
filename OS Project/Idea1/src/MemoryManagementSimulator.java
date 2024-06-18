import java.util.*;

public class MemoryManagementSimulator {
    private static final int MEMORY_SIZE = 1024; // Total memory size in bytes
    private static final int PAGE_SIZE = 64;     // Size of each page/frame in bytes
    private static final int NUM_FRAMES = MEMORY_SIZE / PAGE_SIZE; // Number of frames in memory
    
    private boolean[] frameTable; // Represents the frames in memory, true means frame is occupied
    
    public MemoryManagementSimulator() {
        frameTable = new boolean[NUM_FRAMES];
        Arrays.fill(frameTable, false); // Initially all frames are free
    }
    
    public void allocateMemory(int processId, int numPages) {
        int requiredFrames = (int) Math.ceil((double) numPages / (double) PAGE_SIZE);
        int allocatedFrames = 0;
        
        System.out.println("Allocating " + numPages + " pages for Process " + processId + "...");
        
        for (int i = 0; i < NUM_FRAMES && allocatedFrames < requiredFrames; i++) {
            if (!frameTable[i]) {
                frameTable[i] = true; // Mark frame as occupied
                allocatedFrames++;
                System.out.println("Page " + i + " allocated for Process " + processId);
            }
        }
        
        if (allocatedFrames < requiredFrames) {
            System.out.println("Not enough memory for Process " + processId + ". Memory allocation failed.");
        } else {
            System.out.println("Memory allocation successful for Process " + processId);
        }
    }
    
    public void deallocateMemory(int processId) {
        System.out.println("Deallocating memory for Process " + processId + "...");
        
        for (int i = 0; i < NUM_FRAMES; i++) {
            if (frameTable[i]) {
                // Assuming each frame is allocated to only one process for simplicity
                frameTable[i] = false; // Free the frame
                System.out.println("Page " + i + " deallocated from Process " + processId);
            }
        }
        
        System.out.println("Memory deallocation successful for Process " + processId);
    }
    
    public void printMemoryUsage() {
        System.out.println("\nMemory Usage:");
        for (int i = 0; i < NUM_FRAMES; i++) {
            if (frameTable[i]) {
                System.out.println("Frame " + i + " is allocated.");
            } else {
                System.out.println("Frame " + i + " is free.");
            }
        }
    }
    
    public static void main(String[] args) {
        MemoryManagementSimulator simulator = new MemoryManagementSimulator();
        
        // Test memory allocation
        simulator.allocateMemory(1, 4); // Allocate 4 pages for Process 1
        simulator.printMemoryUsage();
        
        // Test memory deallocation
        simulator.deallocateMemory(1); // Deallocate memory for Process 1
        simulator.printMemoryUsage();
    }
}

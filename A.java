import java.util.*;

public class A {
    public static void main(String[] args) {
        // Simulate Bluetooth device discovery
        List<String> discoveredDevices = discoverDevices();
        
        // Print discovered devices
        System.out.println("Discovered Bluetooth devices:");
        for (String device : discoveredDevices) {
            System.out.println(device);
        }
    }

    // Method to simulate Bluetooth device discovery
    public static List<String> discoverDevices() {
        // Generate some mock Bluetooth device names
        List<String> devices = new ArrayList<>();
        devices.add("Smartphone");
        devices.add("Smartwatch");
        devices.add("Bluetooth Speaker");
        devices.add("Laptop");
        devices.add("Tablet");
        devices.add("Fitness Tracker");
        devices.add("Headphones");
        devices.add("Printer");
        
        // Simulate random device discovery (up to 5 devices)
        Random random = new Random();
        int numDevices = random.nextInt(5) + 1;
        List<String> discoveredDevices = new ArrayList<>();
        for (int i = 0; i < numDevices; i++) {
            int index = random.nextInt(devices.size());
            discoveredDevices.add(devices.get(index));
        }
        
        return discoveredDevices;
    }
}

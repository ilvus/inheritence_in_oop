import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        // Ask the user to input the number of devices
        int numDevices = 5; // You can change this value as needed

        // Create an ArrayList to store the generated devices
        ArrayList<Device> devices = new ArrayList<>();

        // Generate random instances of devices
        Random rand = new Random();
        for (int i = 0; i < numDevices; i++) {
            int deviceType = rand.nextInt(3); // Randomly select device type (0: Smartphone, 1: Laptop, 2: Tablet)

            // Generate random attributes
            String type = "";
            double price = rand.nextDouble() * 1000; // Random price between 0 and 1000 USD
            double weight = rand.nextDouble() * 1000; // Random weight between 0 and 1000 grams

            switch (deviceType) {
                case 0:
                    type = "Smartphone";
                    double screenSize = rand.nextDouble() * 6 + 3; // Random screen size between 3 and 9 inches
                    int cameraResolution = rand.nextInt(12) + 5; // Random camera resolution between 5 and 16 MP
                    devices.add(new Smartphone(type, price, weight, screenSize, cameraResolution));
                    break;
                case 1:
                    type = "Laptop";
                    String processor = "Processor" + (rand.nextInt(9) + 1); // Random processor name
                    int ram = rand.nextInt(16) + 4; // Random RAM between 4 and 20 GB
                    devices.add(new Laptop(type, price, weight, processor, ram));
                    break;
                case 2:
                    type = "Tablet";
                    boolean isPortable = rand.nextBoolean(); // Randomly set portability
                    devices.add(new Tablet(type, price, weight, isPortable));
                    break;
            }
        }

        // Calculate the required information
        int numDistinctTypes = (int) devices.stream().map(Device::getType).distinct().count();
        double totalPrice = devices.stream().mapToDouble(Device::getPrice).sum();
        double totalWeight = devices.stream().mapToDouble(Device::getWeight).sum();

        // Display the information
        System.out.println("Number of distinct device types created: " + numDistinctTypes);
        System.out.println("Total price of all devices: $" + totalPrice);
        System.out.println("Total weight of all devices: " + totalWeight + " grams");
    }
}

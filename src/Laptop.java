public class Laptop extends Device {
    private String processor;
    private int ram;

    public Laptop(String type, double price, double weight, String processor, int ram) {
        super(type, price, weight);
        this.processor = processor;
        this.ram = ram;
    }

    public String getProcessor() {
        return processor;
    }

    public void setProcessor(String processor) {
        this.processor = processor;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }
}

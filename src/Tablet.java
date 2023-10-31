public class Tablet extends Device {
    private boolean isPortable;

    public Tablet(String type, double price, double weight, boolean isPortable) {
        super(type, price, weight);
        this.isPortable = isPortable;
    }

    public boolean isPortable() {
        return isPortable;
    }

    public void setPortable(boolean portable) {
        isPortable = portable;
    }
}

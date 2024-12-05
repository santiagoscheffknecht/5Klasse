package at.santi.demo.objective;

public class Objective {
    private String manufacturer;
    private double focalLength;

    // Constructor
    public Objective(String manufacturer, double focalLength) {
        this.manufacturer = manufacturer;
        this.focalLength = focalLength;
    }

    // Getters and Setters
    public String getManufacturer() {
        return manufacturer;
    }

    public double getFocalLength() {
        return focalLength;
    }
}

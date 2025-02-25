public class Sphere {

    // diameter of the sphere
    private double diameter;

    // initializing the diameter
    public Sphere(double diameter) {
        this.diameter = diameter;
    }

    // Getter method for the diameter
    public double getDiameter() {
        return diameter;
    }

    // Setter method for the diameter
    public void setDiameter(double diameter) {
        this.diameter = diameter;
    }

    // Method to calculate and return the volume of the sphere
    public double getVolume() {
        double radius = diameter / 2;
        return (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
    }

    // Method to calculate and return the surface area of the sphere
    public double getSurfaceArea() {
        double radius = diameter / 2;
        return 4 * Math.PI * Math.pow(radius, 2);
    }

    // toString method to return a one-line description of the sphere

    public String toString() {
        return "Sphere with diameter: " + diameter + " units, volume: " + getVolume() + " cubic units, surface area: " + getSurfaceArea() + " square units.";
    }
}


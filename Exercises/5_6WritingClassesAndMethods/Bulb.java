public class Bulb {
    private boolean isOn;

    // Initializing the Bulb state by constructor (off by default)
    public Bulb() {
        this.isOn = false;
    }

    // Turning the Bulb on using method
    public void turnOn() {
        isOn = true;
        System.out.println("The bulb is ON.");
    }

    // Turning the Bulb off by method
    public void turnOff() {
        isOn = false;
        System.out.println("The bulb is OFF.");
    }

    // Method to check the state of the Bulb
    public boolean isOn() {
        return isOn;
    }
}


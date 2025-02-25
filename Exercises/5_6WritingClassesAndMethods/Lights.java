public class Lights {
    public static void main(String[] args) {
        // Instantiate Bulb objects
        Bulb bulb1 = new Bulb();
        Bulb bulb2 = new Bulb();
        Bulb bulb3 = new Bulb();

        // Turn on the first two bulbs
        bulb1.turnOn();
        bulb2.turnOn();

        // Check the status of the third bulb (it should be off by default)
        System.out.println("Is bulb 3 on? " + (bulb3.isOn() ? "Yes" : "No"));
        {

            // Turn off the second bulb
            bulb2.turnOff();
        }
    }
}

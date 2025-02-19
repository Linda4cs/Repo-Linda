import java.util.Random;

public class PinEncryption {

    public static void main(String[] args) {
        int pin = 8491;
        String encryptedPin = encryptPin(pin);
        System.out.println("Encrypted PIN: " + encryptedPin);
    }

    public static String encryptPin(int pin) {

        String pinHex = Integer.toHexString(pin);

        // Generate two random numbers between 1000 and 65535
        Random random = new Random();
        int randomNum1 = 1000 + random.nextInt(64536);
        int randomNum2 = 1000 + random.nextInt(64536);

        // Convert the random numbers to hexadecimal
        String randomHex1 = Integer.toHexString(randomNum1);
        String randomHex2 = Integer.toHexString(randomNum2);

        // Sandwich the converted PIN between the two random hexadecimal numbers
        System.out.println("randomHex1" + pinHex + randomHex2);
        return randomHex1 + pinHex + randomHex2;

    }
}
import java.util.Random;
import java.util.Scanner;

public class Dice {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("How many sides does die 1 have? ");
        int sidesDie1 = scanner.nextInt();
        System.out.print("How many sides does die 2 have? ");
        int sidesDie2 = scanner.nextInt();

        // Create a Random object for generating random rolls
        Random random = new Random();

        // Variables to keep track of the total sum and rolls for each die
        int sumDie1 = 0;
        int sumDie2 = 0;

        // Loop to simulate three rolls for each die
        for (int x = 1; x <= 3; x++) {
            // Roll for Die 1 and Die 2
            int rollDie1 = random.nextInt(sidesDie1) + 1;
            int rollDie2 = random.nextInt(sidesDie2) + 1;

            // Print the roll results
            System.out.println("Die 1 " + x + " side roll = " + rollDie1 + ".");
            System.out.println("Die 2 " + x + " side roll = " + rollDie2 + ".");

            // Adding the roll result to each sumDie
            sumDie1 += rollDie1;
            sumDie2 += rollDie2;
        }

        // to get the average
        double avgDie1 = (double) sumDie1 / 3;
        double avgDie2 = (double) sumDie2 / 3;

        // Output the sum and average for each die
        System.out.println("Die 1 rolled a total of " + sumDie1 + " and rolled " + avgDie1 + " on average.");
        System.out.println("Die 2 rolled a total of " + sumDie2 + " and rolled " + avgDie2 + " on average.");

    }
}
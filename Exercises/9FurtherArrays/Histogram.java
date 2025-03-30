


import java.util.Scanner;

public class Histogram {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // Create an array to store the frequency of each input value (from 1 to 100)
        int[] nums = new int[101];

        System.out.println("Enter numbers between 1 and 100 [-2 to quit]: ");
        int num = scan.nextInt();

        // Keep reading input until the user enters -2
        while (num != -2) {
            // Increase the count for the input value in the array
            nums[num]++;
            num = scan.nextInt();
        }

        int base10 = 0;
        // Loop range (1-10, 11-20, .......)
        for (int count = 1; count <= 100; count += 10) {
            // Print the range label (example, "1 - 10")
            System.out.print(count + " - " + (base10 += 10) + " | ");
            // Loop through the values within the current range
            for (int index = count; index <= base10; index++) {
                // Print an asterisk for each occurrence of the value
                while (nums[index] > 0) {
                    System.out.print("*");
                    nums[index]--;
                }
            }
            // Move to the next line for the next loop range
            System.out.println();
        }
    }
}
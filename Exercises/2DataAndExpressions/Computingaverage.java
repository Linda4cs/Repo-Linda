import java.util.Scanner;

public class Computingaverage {
    public static void main(String[] args) {
        // program to read 3 integer values

        int val1, val2, val3;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter fist value");
        val1 = sc.nextInt();

        System.out.println("Enter second value");
        val2 = sc.nextInt();

        System.out.println("Enter third value");
        val3 = sc.nextInt();


        double average = (double) (val1+val2+ val3)/3;

        System.out.println("Average"+average);

    }
}
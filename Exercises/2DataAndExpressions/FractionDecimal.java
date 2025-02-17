import java.util.Scanner;
public class FractionDecimal {
    public static void main(String[] args) {
        // program to read integer numerator and denominator

        int numerator, denominator;
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for the numerator
        System.out.println("Enter the numerator: ");
        numerator = scanner.nextInt();

        System.out.println("Enter the denominator: ");
        denominator = scanner.nextInt();

        double fraction = (numerator)/denominator;

        System.out.println("FractionDecimal: "+fraction);
    }
}
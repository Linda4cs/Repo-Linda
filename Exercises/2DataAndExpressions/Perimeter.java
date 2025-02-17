import java.util.Scanner;
public class Perimeter {
    public static void main(String[] args) {
        // program to convert miles to kilometer

        int side;
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for the numerator
        System.out.print("Enter the side: ");
        side = scanner.nextInt();

        double perimeter = (side)*4;
        System.out.println("Perimeter: "+perimeter);

        double area =  (side)^2;

        System.out.println("Area: " +area);
    }
}
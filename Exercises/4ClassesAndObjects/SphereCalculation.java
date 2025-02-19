import java.util.Scanner;

import static java.lang.Math.PI;

public class SphereCalculation {
    public static void main(String[] args) {
        // to read the radius of a sphere

        double radius;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the radius of a sphere: ");
        radius = scanner.nextDouble();

        double volume = (4.0/3.0) * PI * Math.pow(radius, 3);

        double SurfaceArea = 4 * PI * Math.pow(radius, 2);

        System.out.println("Volume: " + volume);
        System.out.println("SurfaceArea: " + SurfaceArea);

    }
}

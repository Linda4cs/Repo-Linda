import java.util.Scanner;

public class Miles {
    public static void main(String[] args)
    {
        // Conversion form miles to kilometre

        int miles, distance;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter miles");
        miles = sc.nextInt();

        System.out.println("Enter distance");
        distance = sc.nextInt();

        double kilometre = (double) (miles*distance);

        System.out.println("Kilometer" +kilometre);
    }
}

 //********************************************
        //salary.java
        //
        //computes the amount of a raise and the new
        //salary for an employee. the current salary
        //and a performance rating (a String: "Excellent",
        //"Good" or "Poor") are input.
        //********************************************

import java.util.Scanner;
import java.text.NumberFormat;

public class Salary {
    public static void main(String[] args)
    {
        double currentSalary; // employee's current salary
        double raise = 0;       // amount of the raise
        double newSalary;     //new salary for the employee
        String rating;        // performance

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the current salary: ");
        currentSalary = scanner.nextDouble();
        System.out.println("Enter the performance rating (Excellent, Good, or Poor): ");
        rating = scanner.next();

        if (rating.equals(("Excellent")))
            raise = currentSalary * 0.06;

        else if (rating.equals("Good"))
            raise = currentSalary * 0.04;

        else if (rating.equals("Poor"))
            raise = currentSalary * 0.015;

        else
            System.out.println("False");

        newSalary = currentSalary + raise;

        // Print the results
        NumberFormat money = NumberFormat.getCompactNumberInstance();
        System.out.println();
        System.out.println("Current Salary: " + money.format(currentSalary));
        System.out.println("Amount of your raise: " + money.format(raise));
        System.out.println("Your new salary: "+ money.format(newSalary));
        System.out.println();

    }

}
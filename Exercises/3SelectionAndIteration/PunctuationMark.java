import java.util.Scanner;

public class PunctuationMark {
    public static void main(String[] args)
    {
        //program to count punctuation mark
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string");
        String s = scanner.next();

        int periodicCount = 0;
        int commaCount = 0;
        int semicolonCount = 0;
        int colonCount = 0;
        int total = 0;

        //iterate through the character
        for (int i = 1; i < s.length(); i++)
            if (s.charAt(i) == ',')

                periodicCount++;
        total++;

        if (s.charAt(0) == ',')
            commaCount++;
        total++;

        if (s.charAt(0) == ',')
            semicolonCount++;
        total++;

        if (s.charAt(0) == ',')
            colonCount++;
        total++;

        System.out.println("There are " +  periodicCount + " periods in this string");
        System.out.println("There are " +  commaCount + " commas in this string");
        System.out.println("There are " +  semicolonCount + " semicolons in this string");
        System.out.println("There are " +  colonCount + " colons in this string");
        System.out.println("There are " +  total + " totals in theis string");

    }
}

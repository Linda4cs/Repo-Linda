import java.util.Scanner;

public class StringReverse {
    public static void main(String[] args)
    {
        // To get the input from the user
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a sentence: ");
        String sentence = scanner.nextLine();

        String[] words = sentence.split("word");

        // Iterate over each word and reverse it
        StringBuilder result = new StringBuilder();
        for (String word : words) {

            // Reverse the word and append to the result
            result.append(new StringBuilder(word).reverse()).append(" ");
        }

        System.out.println("Reversed sentence: " + result.toString().trim());

    }
}

import java.util.Scanner;

// Class to represent a person's name and postal code
class NameAndZip {
    private String firstName;
    private String lastName;
    private int postCode;

    // providing values for objects by constructor initializer
    public NameAndZip(String firstName, String lastName, int postalCode) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.postCode = postalCode;
    }
    @Override
    public String toString() {
        return firstName + " " + lastName + ": " + postCode;
    }
}

// Driver class to test the NameAndZip class
public class PostCode {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Assuming up to 25 pairs of names and postal codes
        int maxEntries = 25;
        NameAndZip[] entries = new NameAndZip[maxEntries];
        int numEntries = 0;  // Variable to keep track of the number of entries

        System.out.println("Type names and postal codes:");

        // Read up to 25 pairs of names and postal codes
        while (numEntries < maxEntries) {
            System.out.print("Enter first name: ");
            String firstName = scanner.next();

            System.out.print("Enter last name: ");
            String lastName = scanner.next();

            System.out.print("Enter postal code: ");
            int postalCode = scanner.nextInt();

            // Create a NameAndZip object and store it in the array
            entries[numEntries] = new NameAndZip(firstName, lastName, postalCode);

            numEntries++;  // Increment the number of entries

            // Ask the user if they want to enter more data
            System.out.print("Do you want type more data? (yes/no): ");
            String moreData = scanner.next().toLowerCase();

            if (!moreData.equals("yes")) {
                break;  // Exit the loop
            }
        }

        // Print the list of names and postal codes using the toString method
        System.out.println("\nList of Names and Post Codes:");
        for (int i = 0; i < numEntries; i++) {
            System.out.println(entries[i].toString());
        }

        // Scanner closer
        scanner.close();
    }
}

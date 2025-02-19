// ******************************************
// Rock.java
// Play Rock, Paper, Scissors with the user
import java.util.Locale;
import java.util.Scanner;
import  java.util.Random;

public class Rock {
    public static void main(String[] args)
    {
        String personPlay; // User's play -- "R", "P", or "S"("");   //User's play -- "R", "P", or "S"
        String computerPlay;  //Computer's play --"R", "P", or "S"
        int computerInt;      //Randomly generated number used to determine
                              // computer's play
        Scanner scanner =new Scanner(System.in);
        Random generator = new Random();

        System.out.println("Enter you play (R for Rock, P for Paper, S for scissors): ");
        personPlay = scanner.nextLine().toUpperCase();

        //Get player's play -- note that this is stored as
        //Make player's play uppercase for ease of comparing
        //Generate computer's play (0,1,2)
        computerInt = generator.nextInt(3);

        //Translate computer's randomly generated play to
         switch (computerInt)
        {

            case 0:
                computerPlay = "R";
                break;
            case 1:
                computerPlay = "P";
                break;
            case 2:
                computerPlay = "S";
                break;
            default:
                computerPlay = "R"; // Default case (should not happen)
                break;
        }

        //Print computer's play
        System.out.println("Computer's: " +computerPlay);

        //See who won. Use nested ifs instead of &&.
        if (personPlay.equals(computerPlay))
            System.out.println("It's a tie ");
        else if (personPlay.equals("R"))
             if (computerPlay.equals("S"))
                System.out.println("Rock crushes scissors. you win");
             else {
                 System.out.println("Paper covers rock. Computer win!! ");

                 //if personPlay rock (1)
                 if (personPlay.equals("P"))
                     if (computerPlay.equals("R"))
                         System.out.println("Paper covers rock. you win!! ");
                     else
                         System.out.println("Scissors cut paper. Computer you win!! ");
             }
             //user play paper (2)
        if (personPlay.equals("S"))
            if (computerPlay.equals("P"))
                System.out.println("Scissors cut paper. you win!! ");
        else
             System.out.println("Rock crushes scissors. Computer wins!! ");

        {

        }

    }

}
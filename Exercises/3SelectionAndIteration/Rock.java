// ******************************************
// Rock.java
// Play Rock, Paper, Scissors with the user
import java.util.Scanner;
import  java.util.Random;

public class Rock {
    public static void main(String[] args)
    {
        String personPlay = "personPlay";   //User's play -- "R", "P", or "S"
        String computerPlay = "computerPlay";  //Computer's play --"R", "P", or "S"
        int computerInt;      //Randomly generated number used to determine
        // computer's play
        Scanner scanner =new Scanner(System.in);
        Random generator = new Random();

        //Get player's play -- note that this is stored as
        //Make player's play uppercase for ease of comparing
        //Generate computer's play (0,1,2)
        //Translate computer's randomly generated play to switch (computerInt)

        {

        }
        //Print computer's play
        //See who won. Use nested ifs instead of &&.
        if (personPlay.equals(computerPlay))
            System.out.println("It's a lie ");
        else if (personPlay.equals("R"))
             if (computerPlay.equals("S"))
                System.out.println("Rock crushes scissors");
             else
                System.out.println("Paper has won");



        {

        }

    }

}



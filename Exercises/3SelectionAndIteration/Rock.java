// ******************************************
// Rock.java
// Play Rock, Paper, Scissors with the user
import java.util.Scanner;
import  java.util.Random;

public class Rock {
    public static void main(String[] args)
    {
        String personPlay = new String("");   //User's play -- "R", "P", or "S"
        String computerPlay = new String();  //Computer's play --"R", "P", or "S"
        int computerInt;      //Randomly generated number used to determine
                              // computer's play
        Scanner scanner =new Scanner(System.in);
        Random generator = new Random();

        //Get player's play -- note that this is stored as
        //Make player's play uppercase for ease of comparing
        //Generate computer's play (0,1,2)
        //Translate computer's randomly generated play to switch (computerInt)

        //Print computer's play
        //See who won. Use nested ifs instead of &&.
        if (personPlay.equals(computerPlay))
            System.out.println("It's a tie ");
        else if (personPlay.equals("R"))
             if (computerPlay.equals("S"))
                System.out.println("Rock crushes scissors. you win");
             else {
                 System.out.println("Paper is good to go ");

                 //if personPlay rock (1)
                 if (personPlay.equals("P"))
                     if (computerPlay.equals("R"))
                         System.out.println("the Rock has crushed again");
                     else
                         System.out.println("The Rock lost");
             }
             //user play paper (2)
        if (personPlay.equals("S"))
            if (computerPlay.equals("R"))
                System.out.println("Scissors is on the game");
        else
             System.out.println("The computer is Rock. You are Paper. paper won");
        {

        }

    }

}
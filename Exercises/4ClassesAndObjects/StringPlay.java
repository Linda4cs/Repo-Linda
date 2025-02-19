import java.sql.SQLOutput;

// **************************************************
//   StringPlay.java
//
//   Play with String objects
// **************************************************
    public class StringPlay
    {
        public static void main (String[] args)
        {
            String college = new String ("Leeds Beckett University"); //Similar for part (a)
            String town = new String("Leeds, Uk");

            int stringLength;
            String change1, change2, change3;

            stringLength = college.length();

            System.out.println (college + " contains " + stringLength + " characters.");

            change1 = college.toUpperCase(); // part (c)


            change2 = change1.replace('e', '*'); // part (d)
             System.out.println();


            change3 =  college.concat("leeds");// part (e)
            System.out.println("College name: + college");
            System.out.println("Leeds: " +  town);
            System.out.println("Length of college: " + stringLength);
            System.out.println("Change1 (upper case): " + change1);
            System.out.println("Change2 (replace 'e' with '*'): " + change2);
            System.out.println("Change3 (college +    Leeds): " + change3);
            System.out.println ("The final string is " + change3);
        }
    }
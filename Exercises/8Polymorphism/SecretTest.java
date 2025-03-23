//********************************************************************
//  SecretTest.java       Java Foundations
//
//  Demonstrates the use of a formal interface.
//********************************************************************

public class SecretTest
{
   //-----------------------------------------------------------------
   //  Creates a Secret object and exercises its encryption.
   //-----------------------------------------------------------------
   public static void main(String[] args)
   {
      Secret hush = new Secret("Linda Dike is my hero!");
      System.out.println("Secret before encryption: " + hush );

      hush.encrypt();
      System.out.println("Secret after encryption: " + hush);

      hush.decrypt();
      System.out.println("Secret after decryption: " + hush);

      hush = new Secret("Excellent Nd");
      System.out.println("Password after encryption: " + hush);

      hush.encrypt();
      System.out.println("Password after encryption: " + hush);

      hush.decrypt();
      System.out.println("Password after decryption: " + hush);
   }
}

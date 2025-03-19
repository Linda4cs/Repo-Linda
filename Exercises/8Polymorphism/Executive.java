//********************************************************************
//  Executive.java       Java Foundations
//
//  Represents an executive staff member, who can earn a bonus.
//********************************************************************

public class Executive extends Employee
{
   private double bonus;

   //-----------------------------------------------------------------
   //  Constructor: Sets up this executive with the specified
   //  information.
   //-----------------------------------------------------------------
   public Executive(String eName, String eAddress, String ePhone,
                    String socSecNumber, double rate, int vacation){
      super(eName, eAddress, ePhone, socSecNumber, rate, vacation);

      bonus = 0;  // bonus has yet to be awarded

   }

   //-----------------------------------------------------------------
   //  Awards the specified bonus to this executive.
   //-----------------------------------------------------------------
   public void awardBonus(double execBonus)
   {

      bonus = execBonus;
   }

   //-----------------------------------------------------------------
   //  Computes and returns the pay for an executive, which is the
   //  regular employee payment plus a one-time bonus.
   //-----------------------------------------------------------------
   public double pay()
   {
      double payment = super.payRate + bonus;

      bonus = 0;

      return payment;
   }
   //------------------------------------------------
   // Return information about this executive as a string.
   //------------------------------------------------

   public String toString(){
      String result = super.toString();
      result += "\nBonus: " + bonus;
      return result;
   }
}

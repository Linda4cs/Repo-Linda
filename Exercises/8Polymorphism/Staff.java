//********************************************************************
//  Staff.java       Java Foundations
//
//  Represents the personnel staff of a particular business.
//********************************************************************

public class Staff
{
   private StaffMember[] staffList;

   //-----------------------------------------------------------------
   //  Constructor: Sets up the list of staff members.
   //-----------------------------------------------------------------
   public Staff ()
   {
      staffList = new StaffMember[6];

      staffList[0] = new Executive("Linda", "252 Park Rd", "555-0469", "123-45-6789", 2423.07, 3);

      staffList[1] = new Employee("Charles", "44 Dewberry Line",
         "555-0101", "987-65-4321", 1246.15, 4);
      staffList[2] = new Employee("Dike", "01 Headingley Campus",
         "555-0000", "010-20-3040", 1169.23, 7);

      staffList[3] = new Hourly("Ndidi", "55 Mbano St.",
         "555-0690", "958-47-3625", 10.55, 5);

      staffList[4] = new Volunteer("Adrianna", "987 Babe Blvd.",
         "555-8374");
      staffList[5] = new Volunteer("Benny", "321 Dud Lane",
         "555-7282");

      ((Executive)staffList[0]).awardBonus(500.00);

      ((Hourly)staffList[3]).addHours(40);
   }

   //-----------------------------------------------------------------
   //  Pays all staff members.
   //-----------------------------------------------------------------
   public void payday() {
      double amount;

      for (int count = 0; count < staffList.length; count++) {
         System.out.println(staffList[count]);

         amount = staffList[count].pay();  // polymorphic

         if (amount == 0.0)
            System.out.println("Thanks!");
         else
            System.out.println("Paid: " + amount);

         System.out.println("-----------------------------------");

      }


      }

   //-----------------------------------------------------------------
   //  Gives vacation days to each staff member.
   //-----------------------------------------------------------------
   public void giveVacation() {
      for (int count = 4; count < staffList.length; count++) {
         if (staffList[count] instanceof Employee) {
            Employee employee = (Employee) staffList[count];
            System.out.println(employee.name + " has " + employee.getVacationDays() + " vacation days.");
            // Give vacation days to the employee
            employee.takeVacation(3); // Example of giving 5 vacation days
         }
      }
   }
   }

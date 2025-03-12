public class Hospital {

    public static void main(String[] args) {

        // Create instances of different employees
        Doctor doctor = new Doctor("Dr. Linda", 200, "Surgeon");
        Nurse nurse = new Nurse("Glory", 201, 10);
        Receptionist receptionist = new Receptionist("Charles", 105, 15);
        Cleaner cleaner = new Cleaner("Kamsi", 106, "Reception Hall");

        doctor.performService();
        nurse.performService();
        receptionist.performService();
        cleaner.performService();
    }
}


class Cleaner extends Employee {
    private String department;

    public Cleaner(String name, int employeeNumber, String department) {
        super(name, employeeNumber);
        this.department = department;
    }

    @Override
    public void performService() {
        System.out.println("Cleaner: " + getName() + " Emp#" + getEmployeeNumber() + " of " + department + " is Mobbing");
    }
}

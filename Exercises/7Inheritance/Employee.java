abstract class Employee {
    protected String employeeName;
    protected int employeeNumber;

    public Employee(String name, int employeeNumber) {
        this.employeeName = name;
        this.employeeNumber = employeeNumber;
    }

    public abstract void performService();

    public String getName() {
        return employeeName;
    }

    public int getEmployeeNumber() {
        return employeeNumber;
    }
}

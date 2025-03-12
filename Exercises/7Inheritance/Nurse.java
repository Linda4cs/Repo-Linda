class Nurse extends Employee {
    private int numberOfPatients;

    public Nurse(String name, int employeeNumber, int numberOfPatients) {
        super(name, employeeNumber);
        this.numberOfPatients = numberOfPatients;
    }

    @Override
    public void performService() {
        System.out.println("Nurse: " + getName() + " Emp#" + getEmployeeNumber() + " has " + numberOfPatients + " patients");
    }
}

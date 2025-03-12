class Receptionist extends Employee {
    private int numberOfAppointments;

    public Receptionist(String name, int employeeNumber, int numberOfAppointments) {
        super(name, employeeNumber);
        this.numberOfAppointments = numberOfAppointments;
    }

    @Override
    public void performService() {
        System.out.println("Receptionist " + getName() + " Emp#" + getEmployeeNumber() + " has " + numberOfAppointments + " Today's appointment");
    }
}

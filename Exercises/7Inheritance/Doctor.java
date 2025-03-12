class Doctor extends Employee {
    private String specialization;

    public Doctor(String name, int employeeNumber, String specialization) {
        super(name, employeeNumber);
        this.specialization = specialization;
    }

    @Override
    public void performService() {
        System.out.println("Doctor " + getName() + " Emp#" + getEmployeeNumber() + " specializes in " + specialization);
    }
}

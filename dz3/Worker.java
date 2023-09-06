package dz3;

// Наследник Worker, представляющий рабочего
class Worker extends Employee {
    private double monthlySalary;

    public Worker(String name, double monthlySalary) {
        super(name);
        this.monthlySalary = monthlySalary;
    }

    public double getMonthlySalary() {
        return monthlySalary;
    }

    public void setMonthlySalary(double monthlySalary) {
        this.monthlySalary = monthlySalary;
    }

    @Override
    public double calculateMonthlySalary() {
        return monthlySalary;
    }

    @Override
    public String toString() {
        return super.toString() + " | Тип сотрудника: Работник";
    }

    @Override
    public int compareTo(Employee o) {
        throw new UnsupportedOperationException("Unimplemented method 'compareTo'");
    }
}
package dz3;

// Наследник Freelancer, представляющий фрилансера
class Freelancer extends Employee {
    private double hourlyRate;

    public Freelancer(String name, double hourlyRate) {
        super(name);
        this.hourlyRate = hourlyRate;
    }

    public double getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    @Override
    public double calculateMonthlySalary() {
        return 20.8 * 8 * hourlyRate;
    }

    @Override
    public String toString() {
        return super.toString() + " | Тип сотрудника: Фрилансер";
    }

    @Override
    public int compareTo(Employee o) {
        throw new UnsupportedOperationException("Unimplemented method 'compareTo'");
    }
}

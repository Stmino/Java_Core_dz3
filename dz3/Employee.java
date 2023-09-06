package dz3;

import java.util.Random;

// Абстрактный класс, представляющий сотрудника
abstract class Employee implements Comparable<Employee> {

    private int id;
    private String name;
    private static Random random = new Random();

    // Конструктор для установки имени сотрудника
    public Employee(String name) {
        this.id = random.nextInt(1000);
        ;
        this.name = name;
    }

    // Абстрактный метод для расчета среднемесячной зарплаты
    public abstract double calculateMonthlySalary();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "ID: " + id + " | Имя: " + name + " | Заработная плата: " + calculateMonthlySalary();
    }

}
package dz3;

import java.util.Comparator;

// Компаратор для сравнения сотрудников по ID
class IdComparator implements Comparator<Employee> {
    @Override
    public int compare(Employee employee1, Employee employee2) {
        return Integer.compare(employee1.getId(), employee2.getId());
    }
}
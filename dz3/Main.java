
package dz3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Создаем список сотрудников
        List<Employee> employees = new ArrayList<>();
        employees.add(new Freelancer("Катя", 12.6));
        employees.add(new Worker("Вика", 25000));
        employees.add(new Freelancer("Зина", 155));

        // Выводим информацию о сотрудниках
        for (Employee employee : employees) {
            System.out.println(employee.toString());
            System.out.println("-------------------------");
        }

        // Сортируем сотрудников по id с использованием IdComparator
        Collections.sort(employees, new IdComparator());

        // Выводим информацию о сотрудниках после сортировки по id
        System.out.println("Информация о сотрудниках после сортировки по id:\n");
        for (Employee employee : employees) {
            System.out.println(employee.toString());
            System.out.println("-------------------------");
        }
    }
}
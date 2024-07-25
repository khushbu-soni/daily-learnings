package org.example;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Epam {
        public static void main(String[] args) {

            List<Employee> employees = Arrays.asList(
                    new Employee(1, "John Doe", 35, "Engineering", 60000),
                    new Employee(2, "Jane Smith", 28, "Marketing", 50000),
                    new Employee(3, "Jack Johnson", 40, "Engineering", 70000),
                    new Employee(4, "Emily Davis", 25, "HR", 40000),
                    new Employee(5, "Michael Brown", 32, "Engineering", 65000)
            );
            List<List<Employee>> list1 = Arrays.asList(employees);

            List<Employee> finalList = employees.stream().filter(employee -> employee.getAge() > 30).collect(Collectors.toList());
//            List<Object> collect = employees.stream().map(String::toUpperCase).collect(Collectors.toList());
            finalList.forEach(list->System.out.println("Employe"+list));

        }
}

package org.example;

import java.util.Arrays;
import java.util.List;

public class Test {

    public static class   Employee{
        int id;
        String name;
      public static String department;


        public Employee(int id, String name, String department) {

            this.id=id;
            this.name=name;
            this.department=department;
        }


    }

    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(new Employee(1, "rishi", "dev"), new Employee(1, "srikanth", "test"));
//        employees.stream().collect(Collectors.groupingBy(Employee.department,Collectors.counting()));
    }
}

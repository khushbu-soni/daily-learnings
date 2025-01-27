package org.example;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
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

        List<String> str=Arrays.asList("Kushi","Soni","Rahul","Soni");

        Collections.sort(str,(str1, str2) -> str2.compareTo(str1)); //Ascending
        Collections.sort(str, (str1, str2) -> str1.compareTo(str2)); //Descending order
        Collections.sort(str, String::compareTo); //Descending order
        str.sort(String::compareTo); //ascending order default
        str.sort(Comparator.reverseOrder()); //Descending order

        System.out.println("Strings sorted in descending order: " + str);
    }
}

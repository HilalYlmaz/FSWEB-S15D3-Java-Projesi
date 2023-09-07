package com.workintech.company.main;

import com.workintech.company.model.Employee;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        LinkedList<Employee> employees = new LinkedList<>();
        employees.add(new Employee(1, "Hilal", "Yılmaz"));
        employees.add(new Employee(1, "Ali", "Veli"));
        employees.add(new Employee(2,"Ayşe", "Ayşe"));
        employees.add(new Employee(2, "Ahmet", "Ahmet"));
        System.out.println(employees);
        Map<Integer, Employee> employeeMap = new HashMap<>();
        List<Employee> removedEmployee = new ArrayList<>();

        Iterator iterator = employees.iterator();
        while (iterator.hasNext()){
            Employee employee = (Employee) iterator.next();
            if (employeeMap.containsKey(employee.getId())) {
                removedEmployee.add(employee);
            }else {
                employeeMap.put(employee.getId(), employee);
            }
        }
        for (Employee employee : removedEmployee){
            employees.remove(employee);
        }
        System.out.println(removedEmployee);

        System.out.println(employeeMap);


    }
}
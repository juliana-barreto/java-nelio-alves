package io.github.juliana_barreto.exercises.section10;

import io.github.juliana_barreto.entities.Employee;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Locale;

public class EmployeeManagement {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

    System.out.print("How many employees will be registered? ");
    int n = scanner.nextInt();
    System.out.println();
    List<Employee> list = new ArrayList<>();

    for (int i = 0; i < n; i++) {
      System.out.printf("Employee #%d:\n", i + 1);
      System.out.print("ID: ");
      int id = scanner.nextInt();
      while (findEmployeeById(list, id) != null) {
        System.out.println("ID already taken! Try again.");
        id = scanner.nextInt();
      }
      scanner.nextLine();
      System.out.print("Name: ");
      String name = scanner.nextLine();
      System.out.print("Salary: ");
      double salary = scanner.nextDouble();
      list.add(new Employee.Builder(name, salary).id(id).build());
      System.out.println();
    }

    System.out.print("Enter the employee ID that will have salary increase: ");
    int id = scanner.nextInt();
    Employee emp = findEmployeeById(list, id);
    if (emp == null) {
      System.out.println("This ID does not exist!");
    } else {
      System.out.print("Enter the percentage: ");
      double percentage = scanner.nextDouble();
      emp.increaseSalary(percentage);
    }
    scanner.close();

    System.out.println("\nList of employees:");
    for (Employee employee : list) {
      System.out.println(employee);
    }
  }

  private static Employee findEmployeeById(List<Employee> list, int id) {
    for (Employee employee : list) {
      if (employee.getId().equals(id)) {
        return employee;
      }
    }
    return null;
  }
}

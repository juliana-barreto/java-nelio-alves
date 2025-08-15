package io.github.juliana_barreto.exercises.section08;

import io.github.juliana_barreto.entities.Employee;
import java.util.Scanner;
import java.util.Locale;

public class SalaryIncrease {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    scanner.useLocale(Locale.US);

    System.out.print("Name: ");
    String name = scanner.nextLine();
    System.out.print("Gross Salary: ");
    double grossSalary = scanner.nextDouble();
    System.out.print("Tax: ");
    double tax = scanner.nextDouble();
    scanner.close();

    Employee employee = new Employee.Builder(name, grossSalary).tax(tax).build();
    System.out.println(employee);

    System.out.print("Which percentage to increase salary? ");
    double percentage = scanner.nextDouble();
    employee.increaseSalary(percentage);
    System.out.printf("Updated data: %s", employee);
  }
}

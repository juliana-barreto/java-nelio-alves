package io.github.juliana_barreto.entities;

public class Employee {

  private final String name;
  private double grossSalary;
  private final double tax;

  public Employee(String name, double grossSalary, double tax) {
    if (name == null || name.isBlank()) {
      throw new IllegalArgumentException("Name cannot be blank.");
    }
    if (grossSalary <= 0) {
      throw new IllegalArgumentException("Gross salary must be positive.");
    }
    if (tax < 0) {
      throw new IllegalArgumentException("Tax cannot be negative.");
    }
    this.name = name;
    this.grossSalary = grossSalary;
    this.tax = tax;
  }

  public double netSalary() {
    return grossSalary - tax;
  }

  public void increaseSalary(double percentage) {
    this.grossSalary *= (1 + percentage / 100);
  }

  public String toString() {
    return String.format("%s, $ %.2f", name, netSalary());
  }
}

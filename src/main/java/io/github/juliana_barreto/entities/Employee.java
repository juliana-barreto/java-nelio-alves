package io.github.juliana_barreto.entities;

public class Employee {

  private final String name;
  private double grossSalary;
  private final double tax;
  private final Integer id;

  public Employee(Integer id, String name, double grossSalary, double tax) {
    if (name == null || name.trim().isBlank()) {
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
    this.id = id;
  }

  public Employee(String name, double grossSalary, double tax) {
    this(null, name, grossSalary, tax);
  }

  public Employee(Integer id, String name, double grossSalary) {
    this(id, name, grossSalary, 0.0);
  }

  public String getName() {
    return name;
  }

  public Integer getId() {
    return id;
  }

  public double netSalary() {
    return grossSalary - tax;
  }

  public void increaseSalary(double percentage) {
    if (percentage < 0) {
      throw new IllegalArgumentException("Percentage must be positive.");
    }
    this.grossSalary *= (1 + percentage / 100);
  }

  public String toString() {
    if (id != null) {
      return String.format("%d, %s, $ %.2f", id, name, netSalary());
    } else {
      return String.format("%s, $ %.2f", name, netSalary());
    }
  }

}

package io.github.juliana_barreto.entities;

public class Employee {

  private final Integer id;
  private final String name;
  private double grossSalary;
  private double tax;

  private Employee(Builder builder) {
    this.id = builder.id;
    this.name = builder.name;
    this.grossSalary = builder.grossSalary;
    this.tax = builder.tax;
  }

  public Integer getId() {
    return id;
  }

  public String getName() {
    return name;
  }

  public void setTax(double tax) {
    if (tax < 0) {
      throw new IllegalArgumentException("Tax cannot be negative.");
    }
    this.tax = tax;
  }

  public String toString() {
    if (id != null) {
      return String.format("%d, %s, $ %.2f", id, name, netSalary());
    } else {
      return String.format("%s, $ %.2f", name, netSalary());
    }
  }

  public static class Builder {

    private Integer id;
    private String name;
    private double grossSalary;
    private double tax;

    public Builder(String name, double grossSalary) {
      if (name == null || name.trim().isBlank()) {
        throw new IllegalArgumentException("Name cannot be null or blank.");
      }
      if (grossSalary <= 0) {
        throw new IllegalArgumentException("Gross salary must be positive.");
      }
      this.name = name;
      this.grossSalary = grossSalary;
    }

    public Builder id(Integer id) {
      this.id = id;
      return this;
    }

    public Builder tax(double tax) {
      if (tax < 0) {
        throw new IllegalArgumentException("Tax cannot be negative.");
      }
      this.tax = tax;
      return this;
    }

    public Employee build() {
      return new Employee(this);
    }
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
}

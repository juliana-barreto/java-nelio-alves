package io.github.juliana_barreto.entities;

public class Person {

  private final String name;
  private final int age;
  private final double height;
  private final char gender;

  public Person(String name, int age, double height, char gender) {
    if (name == null || name.isEmpty()) {
      throw new IllegalArgumentException("Name cannot be null or empty.");
    }
    if (age < 0) {
      throw new IllegalArgumentException("Age cannot be negative.");
    }
    if (height < 0) {
      throw new IllegalArgumentException("Height cannot be negative.");
    }
    if (gender != 'F' && gender != 'M' && gender != 'X') {
      throw new IllegalArgumentException("Gender must be 'F' or 'M' or 'X' for unspecified.");
    }
    this.name = name;
    this.age = age;
    this.height = height;
    this.gender = gender;
  }

  public Person(String name, int age, double height) {
    this(name, age, height, 'X');
  }

  public Person(double height, char gender) {
    this("N/A", 0, height, gender);
  }

  public String getName() {
    return name;
  }

  public int getAge() {
    return age;
  }

  public double getHeight() {
    return height;
  }

  public char getGender() {
    return gender;
  }
}
package io.github.juliana_barreto.entities;

public class Person {

  private final String name;
  private final Integer age;
  private final Double height;
  private final Character gender;

  public Person(String name, Integer age, Double height, Character gender) {
    if (name != null && name.trim().isEmpty()) {
      throw new IllegalArgumentException("Name cannot be empty.");
    }
    if (age != null && age < 0) {
      throw new IllegalArgumentException("Age cannot be negative.");
    }
    if (height != null && height < 0) {
      throw new IllegalArgumentException("Height cannot be negative.");
    }
    if (gender != null && gender != 'F' && gender != 'M') {
      throw new IllegalArgumentException("Gender must be 'F' or 'M'.");
    }
    this.name = name;
    this.age = age;
    this.height = height;
    this.gender = gender;
  }

  public Person(String name, int age, double height) {
    this(name, age, height, null);
  }

  public Person(double height, char gender) {
    this(null, null, height, gender);
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
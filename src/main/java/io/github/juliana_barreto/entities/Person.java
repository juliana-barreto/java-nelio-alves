package io.github.juliana_barreto.entities;

public class Person {

  private final String name;
  private final int age;
  private final double height;

  public Person(String name, int age, double height) {
    if (name == null || name.isEmpty()) {
      throw new IllegalArgumentException("Name cannot be null or empty.");
    }
    if (age < 0) {
      throw new IllegalArgumentException("Age cannot be negative.");
    }
    if (height < 0) {
      throw new IllegalArgumentException("Height cannot be negative.");
    }
    this.name = name;
    this.age = age;
    this.height = height;
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
}
package io.github.juliana_barreto.entities;

public class Person {

  private final String name;

  private Integer age;
  private Double height;
  private Character gender;

  public Person(String name, Integer age, Double height, Character gender) {
    if (name.trim().isEmpty()) {
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

  public Person(String name, double height, char gender) {
    this(name, null, height, gender);
  }

  public String getName() {
    return name;
  }

  public Integer getAge() {
    return age;
  }

  public Double getHeight() {
    return height;
  }

  public Character getGender() {
    return gender;
  }

  public void setGender(Character gender) {
    if (gender != 'F' && gender != 'M') {
      throw new IllegalArgumentException("Gender must be 'F' or 'M'.");
    }

    this.gender = gender;
  }

  public void setHeight(Double height) {
    if (height < 0) {
      throw new IllegalArgumentException("Height cannot be negative.");
    }

    this.height = height;
  }

  public void setAge(Integer age) {
    if (age < 0) {
      throw new IllegalArgumentException("Age cannot be negative.");
    }
    this.age = age;
  }
}
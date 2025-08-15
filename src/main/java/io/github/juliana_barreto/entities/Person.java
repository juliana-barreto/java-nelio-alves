package io.github.juliana_barreto.entities;

public class Person {

  private final String name;
  private Integer age;
  private Double height;
  private Character gender;

  private Person(Builder builder) {
    this.name = builder.name;
    this.age = builder.age;
    this.height = builder.height;
    this.gender = builder.gender;
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

  public void setAge(Integer age) {
    if (age < 0) {
      throw new IllegalArgumentException("Age cannot be negative.");
    }
    this.age = age;
  }

  public void setHeight(Double height) {
    if (height < 0) {
      throw new IllegalArgumentException("Height cannot be negative.");
    }

    this.height = height;
  }

  public void setGender(Character gender) {
    if (gender != 'F' && gender != 'M') {
      throw new IllegalArgumentException("Gender must be 'F' or 'M'.");
    }
    this.gender = gender;
  }

  public static class Builder {

    private final String name;
    private Integer age;
    private Double height;
    private Character gender;

    public Builder(String name) {
      if (name == null || name.trim().isEmpty()) {
        throw new IllegalArgumentException("Name cannot be null or empty.");
      }
      this.name = name;
    }

    public Builder height(Double height) {
      if (height != null && height < 0) {
        throw new IllegalArgumentException("Height cannot be negative.");
      }
      this.height = height;
      return this;
    }

    public Builder age(Integer age) {
      if (age != null && age < 0) {
        throw new IllegalArgumentException("Age cannot be negative.");
      }
      this.age = age;
      return this;
    }

    public Builder gender (Character gender) {
      if (gender != null && gender != 'F' && gender != 'M') {
        throw new IllegalArgumentException("Gender must be 'F' or 'M'.");
      }
      this.gender = gender;
      return this;
    }

    public Person build() {
      return new Person(this);
    }
  }
}
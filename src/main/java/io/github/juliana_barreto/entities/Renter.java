package io.github.juliana_barreto.entities;

public class Renter {

  private String name;
  private String email;

  public Renter(String name, String email) {
    if (name == null || name.trim().isEmpty()) {
      throw new IllegalArgumentException("Name cannot be null or empty");
    }
    if (email == null || email.isEmpty()) {
      throw new IllegalArgumentException("Email cannot be null or empty");
    }
    this.name = name;
    this.email = email;
  }

  public String getName() {
    return name;
  }

  public String getEmail() {
    return email;
  }

  public String toString() {
    return String.format("%s, %s", name, email);
  }
}

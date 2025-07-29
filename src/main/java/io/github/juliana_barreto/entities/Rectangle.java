package io.github.juliana_barreto.entities;

public class Rectangle {

  private final double width, height;

  public Rectangle(double width, double height) {
    if (width <= 0 || height <= 0) {
      throw new IllegalArgumentException("Width and height must be positive.");
    }
    this.width = width;
    this.height = height;
  }

  public double getWidth() {
    return width;
  }

  public double getHeight() {
    return height;
  }

  public double area() {
    return width * height;
  }

  public double perimeter() {
    return width * 2 + height * 2;
  }

  public double diagonal() {
    return Math.sqrt(Math.pow(width, 2) + Math.pow(height, 2));
  }

}

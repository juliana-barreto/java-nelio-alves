package io.github.juliana_barreto.section08.ex01;

public class Rectangle {

  private final double width, height;

  Rectangle(double width, double height) {
    this.width = width;
    this.height = height;
  }

  public double area() {
    return width * height;
  }

  public double perimeter() {
    return width * 2 + height * 2;
  }

  public double Diagonal() {
    return Math.sqrt(Math.pow(width, 2) + Math.pow(height, 2));
  }
}

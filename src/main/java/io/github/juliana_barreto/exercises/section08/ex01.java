package io.github.juliana_barreto.exercises.section08;

import io.github.juliana_barreto.entities.Rectangle;
import java.util.Scanner;
import java.util.Locale;

public class ex01 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    scanner.useLocale(Locale.US);

    System.out.print("Enter rectangle width and height:\n");
    double width = scanner.nextDouble();
    double height = scanner.nextDouble();
    scanner.close();

    Rectangle rectangle = new Rectangle(width, height);

    System.out.printf("Area: %.2f\n", rectangle.area());
    System.out.printf("Perimeter: %.2f\n", rectangle.perimeter());
    System.out.printf("Diagonal: %.2f\n", rectangle.diagonal());
  }
}

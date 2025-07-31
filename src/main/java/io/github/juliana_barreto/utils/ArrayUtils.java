package io.github.juliana_barreto.utils;

import java.util.Scanner;

public class ArrayUtils {

  public static int[] readInt(Scanner scanner, int quantity, String prompt) {
    if (quantity <= 0) {
      throw new IllegalArgumentException("Quantity must be greater than zero.");
    }
    int[] numbers = new int[quantity];
    for (int i = 0; i < quantity; i++) {
      System.out.printf("%s #%d: ", prompt, i + 1);
      while (!scanner.hasNextInt()) {
        System.out.printf("Invalid input. Please enter an integer for %s #%d: ", prompt, i + 1);
        scanner.next();
      }
      numbers[i] = scanner.nextInt();
    }
    return numbers;
  }

  public static double[] readDouble(Scanner scanner, int quantity, String prompt) {
    if (quantity <= 0) {
      throw new IllegalArgumentException("Quantity must be greater than zero.");
    }
    double[] numbers = new double[quantity];
    for (int i = 0; i < quantity; i++) {
      System.out.printf("%s #%d: ", prompt, i + 1);
      while (!scanner.hasNextDouble()) {
        System.out.printf("Invalid input. Please enter a number for %s #%d: ", prompt, i + 1);
        scanner.next();
      }
      numbers[i] = scanner.nextDouble();
    }
    return numbers;
  }

  public static int sum(int[] numbers) {
    if (numbers == null || numbers.length == 0) {
      throw new IllegalArgumentException("Array must not be null or empty.");
    }
    int sum = 0;
    for (int i = 0; i < numbers.length; i++) {
      sum += numbers[i];
    }
    return sum;
  }

  public static double sum(double[] numbers) {
    if (numbers == null || numbers.length == 0) {
      throw new IllegalArgumentException("Array must not be null or empty.");
    }
    double sum = 0.0;
    for (int i = 0; i < numbers.length; i++) {
      sum += numbers[i];
    }
    return sum;
  }

  public static double average(int[] numbers) {
    return (double) sum(numbers) / numbers.length;
  }

  public static double average(double[] numbers) {
    return sum(numbers) / numbers.length;
  }

  public static int[] add(int[] a, int[] b) {
    if (a == null || b == null) {
      throw new IllegalArgumentException("Input arrays must not be null.");
    }
    if (a.length != b.length) {
      throw new IllegalArgumentException("Arrays must have the same length.");
    }
    int[] result = new int[a.length];
    for (int i = 0; i < a.length; i++) {
      result[i] = a[i] + b[i];
    }
    return result;
  }

  public static double[] add(double[] a, double[] b) {
    if (a == null || b == null) {
      throw new IllegalArgumentException("Input arrays must not be null.");
    }
    if (a.length != b.length) {
      throw new IllegalArgumentException("Arrays must have the same length.");
    }
    double[] result = new double[a.length];
    for (int i = 0; i < a.length; i++) {
      result[i] = a[i] + b[i];
    }
    return result;
  }
}

package io.github.juliana_barreto.exercises.section10;

import io.github.juliana_barreto.utils.ArrayUtils;
import java.util.Scanner;

public class SumAndAverage {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("How many numbers do you want to enter? ");
    int n = scanner.nextInt();
    double[] numbers = ArrayUtils.readDouble(scanner, n, "Number");
    scanner.close();

    System.out.print("\nVALUES = ");
    for (double number : numbers) {
      System.out.printf("%.2f ", number);
    }

    System.out.printf("\nSUM = %.2f\n", ArrayUtils.sum(numbers));

    System.out.printf("AVERAGE = %.2f\n", ArrayUtils.average(numbers));
  }
}

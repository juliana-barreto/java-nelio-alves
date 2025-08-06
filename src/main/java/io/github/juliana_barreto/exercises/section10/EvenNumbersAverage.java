package io.github.juliana_barreto.exercises.section10;

import io.github.juliana_barreto.utils.ArrayUtils;
import java.util.Scanner;

public class EvenNumbersAverage {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter the size for the array: ");
    int n = scanner.nextInt();
    int[] numbers = ArrayUtils.readInt(scanner, n, "Number");
    scanner.close();

    int evenCount = 0, evenSum = 0;
    for (int number : numbers) {
      if (number % 2 == 0) {
        evenCount++;
        evenSum += number;
      }
    }

    if (evenCount == 0) {
      System.out.println("NO EVEN NUMBERS");
    } else {
      double average = (double) evenSum / evenCount;
      System.out.printf("EVEN NUMBERS AVERAGE = %.1f\n", average);
    }
  }
}


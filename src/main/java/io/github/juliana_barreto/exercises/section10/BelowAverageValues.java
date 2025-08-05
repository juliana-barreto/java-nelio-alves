package io.github.juliana_barreto.exercises.section10;

import io.github.juliana_barreto.utils.ArrayUtils;
import java.util.Scanner;
import java.util.Locale;

public class BelowAverageValues {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

    System.out.print("Enter the size for the array: ");
    int n = scanner.nextInt();
    double[] numbers = ArrayUtils.readDouble(scanner, n, "Number");
    scanner.close();

    double average = ArrayUtils.average(numbers);
    System.out.printf("\nAVERAGE: %.3f\n", average);

    System.out.print("VALUES BELOW AVERAGE: ");
    for (int i = 0; i < n; i++) {
      if (numbers[i] < average) {
        System.out.printf("%.1f ", numbers[i]);
      }
    }
  }
}

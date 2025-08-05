package io.github.juliana_barreto.exercises.section10;

import io.github.juliana_barreto.utils.ArrayUtils;
import java.util.Scanner;

public class NegativeNumberFinder {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("How many numbers do you want to enter? ");
    int n = scanner.nextInt();
    int[] numbers = ArrayUtils.readInt(scanner, n, "Number");
    scanner.close();

    System.out.println("\nNEGATIVE NUMBERS:");
    for (int i = 0; i < n; i++) {
      if (numbers[i] < 0) {
        System.out.println(numbers[i]);
      }
    }
  }
}

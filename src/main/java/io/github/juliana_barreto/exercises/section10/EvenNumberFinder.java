package io.github.juliana_barreto.exercises.section10;

import io.github.juliana_barreto.utils.ArrayUtils;
import java.util.Scanner;

public class EvenNumberFinder {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("How many numbers do you want to enter? ");
    int n = scanner.nextInt();
    int[] numbers = ArrayUtils.readInt(scanner, n, "Number");
    scanner.close();

    int evenCount = 0;
    System.out.println("\nEVEN NUMBERS: ");
    for (int number : numbers) {
      if (number % 2 == 0) {
        System.out.print(number + "  ");
        evenCount++;
      }
    }
    System.out.println("\nTOTAL = " + evenCount);
  }
}

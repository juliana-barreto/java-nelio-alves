package io.github.juliana_barreto.exercises.section10;

import io.github.juliana_barreto.utils.ArrayUtils;
import java.util.Scanner;

public class ex04 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("How many numbers do you want to enter? ");
    int n = scanner.nextInt();
    int[] numbers = ArrayUtils.readInt(scanner, n, "Number");
    scanner.close();

    int evenCount = 0;
    System.out.println("\nEVEN NUMBERS: ");
    for (int i = 0; i < n; i++) {
      if (numbers[i] % 2 == 0) {
        System.out.print(numbers[i] + "  ");
        evenCount++;
      }
    }
    System.out.println("\nTOTAL = " + evenCount);
  }
}

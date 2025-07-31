package io.github.juliana_barreto.exercises.section10;

import io.github.juliana_barreto.utils.ArrayUtils;
import java.util.Scanner;

public class ex05 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("How many numbers do you want to enter? ");
    int n = scanner.nextInt();
    double[] numbers = ArrayUtils.readDouble(scanner, n, "Number");
    scanner.close();

    int maxIndex = 0;
    double maxNum = numbers[0];
    for (int i = 1; i < n; i++) {
      if (numbers[i] > maxNum) {
        maxNum = numbers[i];
        maxIndex = i;
      }
    }
    System.out.println("\nLARGEST VALUE = " + maxNum);
    System.out.println("LARGEST VALUE'S POSITION = " + maxIndex);
  }
}


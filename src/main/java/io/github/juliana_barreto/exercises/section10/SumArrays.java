package io.github.juliana_barreto.exercises.section10;

import io.github.juliana_barreto.utils.ArrayUtils;
import java.util.Scanner;

public class SumArrays {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter the size for the arrays: ");
    int n = scanner.nextInt();

    System.out.println("\nEnter the first array's values: ");
    int[] a = ArrayUtils.readInt(scanner, n, "Number");
    System.out.println("\nEnter the second array's values: ");
    int[] b = ArrayUtils.readInt(scanner, n, "Number");
    scanner.close();

    System.out.println("\nRESULTING ARRAY: ");
    int[] result = ArrayUtils.add(a, b);
    for (int value : result) {
      System.out.printf("%d ", value);
    }
  }
}

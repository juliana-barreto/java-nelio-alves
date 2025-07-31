package io.github.juliana_barreto.exercises.section08;

import io.github.juliana_barreto.utils.CurrencyConverter;
import java.util.Scanner;
import java.util.Locale;

public class ex04 {

  public static void main(String[] args) {
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);

    System.out.print("What is the dollar price? ");
    double dollarPrice = sc.nextDouble();
    System.out.print("How many dollars will be bought? ");
    double dollarAmount = sc.nextDouble();
    sc.close();

    double totalCost = CurrencyConverter.convert(dollarPrice, dollarAmount);
    System.out.printf("Amount to be paid in reais = %.2f%n", totalCost);
  }
}

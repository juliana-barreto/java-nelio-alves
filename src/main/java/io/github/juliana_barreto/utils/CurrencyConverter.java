package io.github.juliana_barreto.utils;

public class CurrencyConverter {

  private static final double IOF = 0.06;

  private CurrencyConverter() {
  }

  public static double convert(double dollarPrice, double dollarAmount) {
    if (dollarPrice < 0 || dollarAmount < 0) {
      throw new IllegalArgumentException("Dollar price and amount must be greater than zero.");
    }
    return dollarAmount * dollarPrice * (1 + IOF);
  }
}

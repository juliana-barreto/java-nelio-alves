package io.github.juliana_barreto.entities;

public class BankAccount {

  private final int accountNumber;
  private String accountHolder;
  private double balance;
  private static final double WITHDRAWAL_FEE = 5.0;

  public String getAccountHolder() {
    return accountHolder;
  }

  public void setAccountHolder(String accountHolder) {
    this.accountHolder = accountHolder;
  }

  public int getAccountNumber() {
    return accountNumber;
  }

  public double getBalance() {
    return balance;
  }

  public BankAccount(int accountNumber, String accountHolder) {
    this.accountNumber = accountNumber;
    this.accountHolder = accountHolder;
    this.balance = 0.0;
  }

  public BankAccount(int accountNumber, String accountHolder, double amount) {
    if (amount < 0) {
      throw new IllegalArgumentException("Initial deposit cannot be negative.");
    }
    this.accountNumber = accountNumber;
    this.accountHolder = accountHolder;
    deposit(amount);
  }

  public String toString() {
    return String.format("Account %d, Holder: %s, Balance: $%.2f",
        accountNumber, accountHolder, balance);
  }

  public void deposit(double amount) {
    if (amount <= 0) {
      throw new IllegalArgumentException("Deposit amount must be positive.");
    }
    this.balance += amount;
  }

  public void withdraw(double amount) {
    if (amount <= 0) {
      throw new IllegalArgumentException("Withdrawal amount must be positive.");
    }
    this.balance -= amount + WITHDRAWAL_FEE;
  }
}



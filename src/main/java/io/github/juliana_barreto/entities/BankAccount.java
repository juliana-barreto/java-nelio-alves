package io.github.juliana_barreto.entities;

public class BankAccount {

  private final int accountNumber;
  private String accountHolder;
  private double balance;
  private static final double WITHDRAWAL_FEE = 5.0;

  public BankAccount(int accountNumber, String accountHolder, double initialDeposit) {
    if (initialDeposit < 0) {
      throw new IllegalArgumentException("Initial deposit cannot be negative.");
    }
    if (accountHolder == null || accountHolder.trim().isEmpty()) {
      throw new IllegalArgumentException("Account holder name cannot be null or empty.");
    }
    this.accountNumber = accountNumber;
    this.accountHolder = accountHolder;
    this.balance = initialDeposit;
  }

  public BankAccount(int accountNumber, String accountHolder) {
    this(accountNumber, accountHolder, 0.0);
  }

  public int getAccountNumber() {
    return accountNumber;
  }

  public String getAccountHolder() {
    return accountHolder;
  }

  public double getBalance() {
    return balance;
  }

  public void setAccountHolder(String accountHolder) {
    this.accountHolder = accountHolder;
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



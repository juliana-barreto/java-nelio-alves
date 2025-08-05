package io.github.juliana_barreto.exercises.section09;

import io.github.juliana_barreto.entities.BankAccount;
import java.util.Scanner;
import java.util.Locale;

public class AccountOperations {
  public static void main (String[] args) {
    Scanner scanner = new Scanner(System.in);
    scanner.useLocale(Locale.US);

    System.out.print("Enter account number: ");
    int accountNumber = scanner.nextInt();
    scanner.nextLine();
    System.out.print("Enter account holder: ");
    String accountHolder = scanner.nextLine();
    System.out.print("Is there an initial deposit (y/n)? ");
    char answer;
    do {
      answer = scanner.next().toLowerCase().charAt(0);
      if (answer != 'y' && answer != 'n') {
        System.out.print("Invalid option. Please enter 'y' or 'n': ");
      }
    } while (answer != 'y' && answer != 'n');

    double amount;
    BankAccount account;
    if (answer == 'y') {
      System.out.print("Enter initial deposit value: ");
      amount = scanner.nextDouble();
      account = new BankAccount(accountNumber, accountHolder, amount);
    } else {
      account = new BankAccount(accountNumber, accountHolder);
    }
    System.out.println("\nAccount data:");
    System.out.println(account);

    System.out.print("Enter a deposit value: ");
    amount = scanner.nextDouble();
    account.deposit(amount);
    System.out.println("\nUpdated account data:");
    System.out.println(account);

    System.out.print("Enter a withdrawal value: ");
    amount = scanner.nextDouble();
    account.withdraw(amount);
    System.out.println("\nUpdated account data:");
    System.out.println(account);
  }
}

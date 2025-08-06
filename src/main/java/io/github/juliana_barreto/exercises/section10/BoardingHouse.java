package io.github.juliana_barreto.exercises.section10;

import io.github.juliana_barreto.entities.Renter;
import java.util.Scanner;

public class BoardingHouse {

  private static final int MAX_ROOMS = 10;

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int n;
    do {
      System.out.print("How many rooms will be rented? ");
      n = scanner.nextInt();
      if (n < 1 || n > MAX_ROOMS) {
        System.out.printf("Invalid. There's a maximum of %d rooms.%n", MAX_ROOMS);
      }
    } while (n < 1 || n > MAX_ROOMS);
    Renter[] rooms = new Renter[MAX_ROOMS];

    for (int i = 0; i < n; i++) {
      scanner.nextLine();
      System.out.printf("%nRent #%d:%n", i + 1);
      System.out.print("Name: ");
      String name = scanner.nextLine();
      System.out.print("Email: ");
      String email = scanner.nextLine();
      int roomNumber;
      do {
        System.out.printf("Room (0-%d): ", MAX_ROOMS - 1);
        roomNumber = scanner.nextInt();
        if (roomNumber < 0 || roomNumber > MAX_ROOMS - 1) {
          System.out.println("Invalid room. Please choose a valid room number.");
        } else if (rooms[roomNumber] != null) {
          System.out.println("Room already rented. Please choose another room.");
          roomNumber = -1;
        }
      } while (roomNumber < 0 || roomNumber > MAX_ROOMS - 1 || rooms[roomNumber] != null);
      rooms[roomNumber] = new Renter(name, email);
    }
    scanner.close();

    System.out.println("\nBusy rooms:");
    for (int i = 0; i < rooms.length; i++) {
      if (rooms[i] != null) {
        System.out.printf("%d: %s\n", i, rooms[i]);
      }
    }
  }
}

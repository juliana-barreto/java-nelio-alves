package io.github.juliana_barreto.exercises.section10;

import io.github.juliana_barreto.entities.Person;
import java.util.Scanner;
import java.util.Locale;

public class HeightAndGenderStats {

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

    System.out.print("Enter the number of people: ");
    int n = scanner.nextInt();
    Person[] people = new Person[n];

    for (int i = 0; i < n; i++) {
      System.out.printf("Person #%d%n", i + 1);
      System.out.print("Height (in meters): ");
      double height = scanner.nextDouble();
      System.out.print("Gender (F/M): ");
      char gender = scanner.next().toUpperCase().charAt(0);
      people[i] = new Person(height, gender);
    }
    scanner.close();

    double minHeight = people[0].getHeight(), maxHeight = people[0].getHeight();
    for (Person person : people) {
      if (person.getHeight() < minHeight) {
        minHeight = person.getHeight();
      }
      if (person.getHeight() > maxHeight) {
        maxHeight = person.getHeight();
      }
    }

    int maleCount = 0, femaleCount = 0;
    double femaleHeightSum = 0.0;
    for (Person person : people) {
      if (person.getGender() == 'M') {
        maleCount++;
      } else {
        femaleCount++;
        femaleHeightSum += person.getHeight();
      }
    }

    System.out.printf("Minimum height: %.2f %n", minHeight);
    System.out.printf("Maximum height: %.2f %n", maxHeight);
    System.out.printf("Women's average height: %.2f %n", femaleHeightSum / femaleCount);
    System.out.println("Number of men: " + maleCount);
  }
}

package io.github.juliana_barreto.exercises.section10;

import io.github.juliana_barreto.entities.Person;
import java.util.Scanner;
import java.util.Locale;

public class PeopleStats {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    scanner.useLocale(Locale.US);

    System.out.print("Enter the number of people: ");
    int n = scanner.nextInt();
    Person[] people = new Person[n];

    for (int i = 0; i < n; i++) {
      System.out.printf("\nPerson #%d:\n", i + 1);
      scanner.nextLine();
      System.out.print("Name: ");
      String name = scanner.nextLine();
      System.out.print("Age: ");
      int age = scanner.nextInt();
      System.out.print("Height: ");
      double height = scanner.nextDouble();
      people[i] = new Person(name, age, height);
    }
    scanner.close();

    System.out.printf("\nAVERAGE HEIGHT: %.2f\n", averageHeight(people));

    int under16Count = 0;
    int[] under16Index = new int[n];
    for (int i = 0; i < n; i++) {
      if (people[i].getAge() < 16) {
        under16Index[under16Count++] = i;
      }
    }
    System.out.printf("PEOPLE UNDER 16 YEARS OLD: %.1f%%\n", (double) under16Count / n * 100);
    for (int i = 0; i < under16Count; i++) {
      System.out.println(people[under16Index[i]].getName());
    }
  }

  private static double averageHeight(Person[] people) {
    double heightSum = 0.0;
    for (Person person : people) {
      heightSum += person.getHeight();
    }
    return heightSum / people.length;
  }
}

package io.github.juliana_barreto.exercises.section10;

import io.github.juliana_barreto.entities.Student;
import io.github.juliana_barreto.utils.ArrayUtils;
import java.util.Locale;
import java.util.Scanner;

public class ex09 {

  private static final int SCORES_COUNT = 2;
  private static final double PASSING_GRADE = 6.0;

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

    System.out.print("Enter the number of students: ");
    int n = scanner.nextInt();
    scanner.nextLine();
    Student[] student = new Student[n];

    for (int i = 0; i < n; i++) {
      System.out.printf("\nStudent #%d:%n", i + 1);
      System.out.print("Name: ");
      String name = scanner.nextLine();
      double[] scores = ArrayUtils.readDouble(scanner, SCORES_COUNT, "Score");
      scanner.nextLine();
      student[i] = new Student(name, scores);
    }
    scanner.close();

    System.out.println("\nApproved students: ");
    for (int i = 0; i < n; i++) {
      if (student[i].average() >= PASSING_GRADE) {
        System.out.println(student[i].getName());
      }
    }
  }
}

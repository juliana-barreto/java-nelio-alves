package io.github.juliana_barreto.exercises.section08;

import io.github.juliana_barreto.entities.Student;
import java.util.Scanner;
import java.util.Locale;

public class StudentApproval {

  private static final int SCORES_COUNT = 3;

  public static void main(String[] args) {
    double[] scores = new double[SCORES_COUNT];
    Scanner scanner = new Scanner(System.in);
    scanner.useLocale(Locale.US);

    System.out.print("Student's name: ");
    String name = scanner.nextLine();
    for (int i = 0; i < SCORES_COUNT; i++) {
      System.out.printf("Score #%d: ", i + 1);
      scores[i] = scanner.nextDouble();
    }
    scanner.close();

    Student student = new Student(name, scores);
    double finalGrade = student.finalGrade();

    System.out.printf("Final grade = %.2f%n", finalGrade);
    if (finalGrade < 60.0) {
      System.out.println("FAILED");
      System.out.printf("Missing %.2f points%n", 60.0 - finalGrade);
    } else {
      System.out.println("PASS");
    }
  }
}

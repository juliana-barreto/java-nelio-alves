package io.github.juliana_barreto.entities;

public class Student {

  private final double[] scores;

  public Student(String name, double[] scores) {
    if (name == null || name.trim().isBlank()) {
      throw new IllegalArgumentException("Name cannot be blank");
    }
    if (scores == null || scores.length == 0) {
      throw new IllegalArgumentException("Scores cannot be empty");
    }
    this.name = name;
    this.scores = scores;
  }

  public double finalGrade() {
    double sum = 0;
    for (int i = 0; i < scores.length; i++) {
      sum += scores[i];
    }
    return sum;
  }

  public double average() {
    return finalGrade() / scores.length;
  }

  public String getName() {
    return name;
  }

  private final String name;

  public double[] getScores() {
    return scores;
  }
}

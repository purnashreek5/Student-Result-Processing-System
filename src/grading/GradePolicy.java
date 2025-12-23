package grading;

public interface GradePolicy {
    String calculateGrade(double percentage);
    String calculateResult(double percentage);
}

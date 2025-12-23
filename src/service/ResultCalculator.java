package service;

import grading.GradePolicy;

public class ResultCalculator implements GradePolicy {

    @Override
    public String calculateGrade(double percentage) {
        if (percentage <= 30) return "Fail (Try Again)";
        else if (percentage <= 35) return "E";
        else if (percentage <= 45) return "D";
        else if (percentage <= 69) return "C";
        else if (percentage <= 79) return "B";
        else if (percentage <= 89) return "A (First Class)";
        else return "A+ (Distinction)";
    }

    @Override
    public String calculateResult(double percentage) {
        return percentage <= 30 ? "FAIL" : "PASS";
    }
}

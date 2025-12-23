package model;

public class Student {

    // Private variables (ENCAPSULATION)
    private String name;
    private String srn;
    private String email;
    private int[] marks;
    private double percentage;
    private String grade;
    private String result;

    // Constructor (OBJECT CREATION)
    public Student(String name, String srn, String email, int[] marks) {
        this.name = name;
        this.srn = srn;
        this.email = email;
        this.marks = marks;
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public String getSrn() {
        return srn;
    }

    public String getEmail() {
        return email;
    }

    public int[] getMarks() {
        return marks;
    }

    public double getPercentage() {
        return percentage;
    }

    public void setPercentage(double percentage) {
        this.percentage = percentage;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }
}

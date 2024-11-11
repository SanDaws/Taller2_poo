package Classes.Exc7;

import java.util.ArrayList;
import java.util.List;

public class Student {
    // Attributes
    private String name;
    private List<Double> grades;

    // Constructor
    public Student(String name) {
        this.name = name;
        this.grades = new ArrayList<>();
    }

    // Method to add a grade
    public void addGrade(double grade) {
        if (grade >= 0 && grade <= 100) {
            grades.add(grade);
            System.out.println("Grade added: " + grade);
        } else {
            System.out.println("Invalid grade. Please enter a value between 0 and 100.");
        }
    }

    // Method to calculate the average grade
    public double calculateAverage() {
        if (grades.isEmpty()) {
            System.out.println("No grades available to calculate the average.");
            return 0;
        }

        double sum = 0;
        for (double grade : grades) {
            sum += grade;
        }
        return sum / grades.size();
    }

    // Method to check if the student passed
    public boolean hasPassed() {
        return calculateAverage() >= 60;
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Double> getGrades() {
        return grades;
    }

    public void setGrades(List<Double> grades) {
        this.grades = grades;
    }

    // Method to display student's information
    public void displayStudentInfo() {
        System.out.println("Name: " + name);
        System.out.println("Grades: " + grades);
        System.out.println("Average: " + calculateAverage());
        System.out.println(hasPassed() ? "Status: Passed" : "Status: Failed");
    }
}

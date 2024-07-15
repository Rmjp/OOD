package week3.eg3;

import java.util.ArrayList;

public class Student extends Person{
    // private instance variables
    private int numCourses;
    /** courses tttst */
    private ArrayList<String> courses;
    private ArrayList<Integer> grades;

    /** Constructs a Student instance with the given name and address */
    public Student(String name, String address) {
        super(name, address);
        numCourses = 0;
        courses = new ArrayList<String>();
        grades = new ArrayList<Integer>();
    }
    

    @Override
    public String toString() {
        return "Student: " + super.toString();
    }

    public void addCourseGrade(String course, int grade) {
        courses.add(course);
        grades.add(grade);
        numCourses++;
    }

    public void printGrades() {
        System.out.print(this);
        for (int i = 0; i < numCourses; i++) {
            System.out.print(" " + courses.get(i) + ":" + grades.get(i));
        }
        System.out.println();
    }

    public double getAverageGrade() {
        int sum = 0;
        for (int grade : grades) {
            sum += grade;
        }
        return (double) sum / numCourses;
    }
}

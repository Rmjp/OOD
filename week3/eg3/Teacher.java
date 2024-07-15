package week3.eg3;

import java.util.ArrayList;

public class Teacher extends Person{
    private int numCourses;
    private ArrayList<String> courses;

    public Teacher(String name, String address) {
        super(name, address);
        numCourses = 0;
        courses = new ArrayList<String>();
    }

    @Override
    public String toString() {
        return "Teacher: " + super.toString();
    }

    public boolean addCourse(String course) {
        if (courses.contains(course)) {
            return false;
        }
        courses.add(course);
        numCourses++;
        return true;
    }

    public boolean removeCourse(String course) {
        if (!courses.contains(course)) {
            return false;
        }
        courses.remove(course);
        numCourses--;
        return true;
    }
}

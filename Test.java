import week3.eg3.*;

public class Test {
    public static void main(String[] args) {
        // Test Student class
        Student s1 = new Student("John", "1 Happy Ave");
        s1.addCourseGrade("Math", 90);
        s1.addCourseGrade("English", 85);
        s1.printGrades();
        System.out.println("Average is " + s1.getAverageGrade());
        
        // Test Teacher class
        Teacher t1 = new Teacher("Paul", "8 Sunset Blvd");
        System.out.println(t1);
        System.out.println(t1.addCourse("Math"));
        System.out.println(t1.addCourse("English"));
        System.out.println(t1.addCourse("Math"));
        System.out.println(t1.removeCourse("Math"));
        System.out.println(t1.removeCourse("Math"));
    }

}

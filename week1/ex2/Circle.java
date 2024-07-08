package week1.ex2;

public class Circle {
    // This is a private field, so it can't be accessed from outside the class
    private double radius;
    
    public Circle(double radius) {
        /*
         * This is the constructor of the Circle class. It is called when a new Circle object is created.
         */
        this.radius = radius;
    }

    public Circle() {
        this.radius = 1;
    }

    public double getRadius() {
        /*
         * This is a public method, so it can be accessed from outside the class.
         */
        return radius;
    }

    public static void main(String[] args) {
        Circle c = new Circle(5);
        System.out.println(Math.PI * c.getRadius() * 2);
    }
}

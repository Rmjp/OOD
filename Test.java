import week1.ex2.Circle;

public class Test {
    public static void main(String[] args) {
        Circle c = new Circle(5);
        System.out.println(Double.toString(Math.PI * c.getRadius() * 2));
    }
}

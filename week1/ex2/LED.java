package week1.ex2;

public class LED {
    private Circle circle;
    public LED(){
        circle = new Circle(5);
    }
    public double getArea(){
        return Math.PI * circle.getRadius() * circle.getRadius();
    }
}

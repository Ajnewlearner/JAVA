// package assignment;

public class Circle {
    private double radius;
    public void circle(double radius){
        this.radius = radius;
    }
    public double getarea(double radius){
        return Math.PI*radius*radius;
    }
    public static void main(String[] args) {
        Circle circle = new Circle();
        double area = circle.getarea(5.0);
        System.out.println("radius "+circle.radius+" , area"+area);
    }
}

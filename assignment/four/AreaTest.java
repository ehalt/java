public class Circle {
    private double radius;

    public Circle(double radius) {
        this.radius;
    }
    public double getRadius() {
        return radius;
    }
}

public class AreaTest {
    public static void main(String[] args) {
        Circle circle = new Circle(5);
        double area = calculateArea(circle);

        System.out.println("Area of circle: " + area);
    }

    public static double calculateArea(Circle cirlcle) {
        double radius = circle.getRadius();
        return Math.PI * radius * radius;
    }
}
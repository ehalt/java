public class AreaTest {
    public static void main(String[] args) {
        Circle circle1 = new Circle();
        System.out.println("Circle 1 radius: " + circle1.getRadius());
        System.out.println("Circle 1 Area: " + circle1.getArea());

        Circle circle2 = new Circle(5.0);
        System.out.println("Circle 2 radius: " + circle2.getRadius());
        System.out.println("Circle 2 Area: " + circle2.getArea());

        System.out.println("Number of circle objects created: " + Circle.getnumberOfobj());
    }
}
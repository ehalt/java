public class Circle {
    private double radius;
    private static int numberOfobj = 0;

    public Circle() {
        this.radius = 1.0;
        numberOfobj++;
    }

    public Circle(double radius) {
        this.radius = radius;
        numberOfobj++;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public static int getnumberOfobj() {
        return numberOfobj;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }
}



import java.util.Scanner;

public class task6 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        System.out.print("Enter a radius number: ");

        double r = cin.nextDouble();

        double area = r * r * 3.1416;

        System.out.println("Area of circle is: " + area);
    }
}

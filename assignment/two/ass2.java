import java.util.Scanner;

public class ass2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter an integer value: ");
        int n = scanner.nextInt();
        scanner.close();


        double piApproximation = calculatePi(n);


        final double STANDARD_PI = 3.14;


        double difference = Math.abs(piApproximation - STANDARD_PI);


        System.out.printf("%.4f%n", difference);
    }

    private static double calculatePi(int n) {
        double pi = 0.0;
        for (int i = 0; i < n; i++) {

            double denominator = 2 * i + 1;

            if (i % 2 == 0) {
                pi += 4.0 / denominator;
            } else {
                pi -= 4.0 / denominator;
            }
        }
        return pi;
    }
    
}

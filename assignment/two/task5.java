import java.util.Scanner;

public class task5 {

    /** Main method */
    public static void main(String[] args) {

        int gcd = 1, n1, n2;
        long startTime, endTime, elapsedTime;
        
        Scanner input = new Scanner(System.in);

        System.out.print("Enter first integer: ");
        n1 = input.nextInt();

        System.out.print("Enter second integer: ");
        n2 = input.nextInt();

        startTime = System.nanoTime();

        for (int k = 2; k <= n1 && k <= n2; k++) {
            if (n1 % k == 0 && n2 % k == 0) {
                gcd = k; 
            }
        }

        endTime = System.nanoTime();
        elapsedTime = endTime - startTime;
        
        System.out.println("Elapsed Time = " + elapsedTime);

        System.out.println("The greatest common divisor for " + n1 + " and " + n2 + " is " + gcd);
    }
}

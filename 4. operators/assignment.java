import java.util.Scanner;
public class assignment { 
    public static void main(String args[]) { 
        Scanner scan = new Scanner(System.in);
        
        int num1, num2;
        num1 = scan.nextInt();
        num2 = scan.nextInt();

        int add = num1 + num2;
        int sub = num1 - num2;
        int mul = num1 * num2;
        int div = num1 / num2;
        System.out.println("Addition: " + add);
        System.out.println("Subtraction: " + sub);
        System.out.println("Multiplication: " + mul);
        System.out.println("Division: " + div);
    }
}
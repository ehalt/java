import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        int number;
        System.out.print("Enter your number:");
        Scanner cin = new Scanner(System.in);

        number = cin.nextInt();

        switch (number) {
            case 100:
            case 90: System.out.println("A"); break;
            case 80: System.out.println("B"); break;
            case 70: System.out.println("C"); break;
            case 60: System.out.println("D"); break;
            default:
                if (number >= 0 && number < 60) {
                    System.out.println("F");
                }
                else {
                    System.out.println("Input error!");
                }
                break;
        }
    }
}
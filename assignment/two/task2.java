import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
        int number;
        Scanner cin = new Scanner(System.in);
        System.out.print("Enter your number: ");
        number = cin.nextInt();

        if (number >= 90 & number < 100) {
        System.out.println("A");
        }
        else if (number >= 80 & number < 90) {
            System.out.println("B");
        }
        else if (number >= 70 & number < 80) {
            System.out.println("C");
        }
        else if (number >= 60 & number < 70) {
            System.out.println("D");
        }
        else {
            System.out.println("F");
        }

    }
}







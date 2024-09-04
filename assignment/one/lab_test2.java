import java.util.Scanner;

public class lab_test2 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);

        System.out.print("Enter time in seconds:");

        int total_sec = cin.nextInt();

        int mins = total_sec / 60;
        int secs = total_sec % 60;

        System.out.println("We got : " + mins + " minutes and " + secs + " seconds!!");
    }
}
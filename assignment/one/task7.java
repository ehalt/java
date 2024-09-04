/* 
    m = monthly payment
    p = the principal loan amount
    r = monthly interest rate (which is annual rate divided by 12) 
    n = is the number of payments ( in months)

*/

import java.util.Scanner;

public class task7 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);

        System.out.print("Enter loan amount:");

        double principal = cin.nextDouble();
        
        System.out.print("Annual interest rate:");
        double annual_intr_rate = cin.nextDouble();

        System.out.print("Number of year:");
        int years = cin.nextInt();

        double monthly_intr_rate = annual_intr_rate / 100 / 12;

        int number_of_payment = years * 12;

        double monthly_payment = (principal * monthly_intr_rate * Math.pow(1 + monthly_intr_rate, number_of_payment)) / (Math.pow(1 + monthly_intr_rate, number_of_payment) - 1);
        
        System.out.println("Monthly payable:" + ((int)(monthly_payment * 100)) / 100.0);

    }
}
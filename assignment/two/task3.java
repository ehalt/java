import java.util.Scanner;

public class task3 {
    public static void main(String[] args){
        Scanner cin = new Scanner(System.in);

        System.out.print("Enter weight in kg:");
        double weight = cin.nextDouble();

        System.out.print("Enter your height in meter:");
        double height = cin.nextDouble();

        double bmi = weight / (height * height);

        int round_bmi = (int) Math.round(bmi);
        
        System.out.println("Your bmi is: " + bmi);

        int category;

        if (bmi < 16) {
            category = 1;
        }
        else if (bmi < 16.9) {
            category = 2;
        }
        else if (bmi < 18.4) {
            category = 3;
        }
        else if (bmi < 24.9) {
            category = 4;
        }
        else if (bmi < 29.9) {
            category = 5;
        }
        else if (bmi < 34.9) {
            category = 6;
        }
        else if (bmi < 39.9) {
            category = 7;
        }
        else {
            category = 8;
        }

        switch(category) {
            case 1:
                System.out.println("severly underweight");
                break;
            case 2:
                System.out.println("Underweight");
                break;
            case 3:
                System.out.println("Midly underweight");
                break;
            case 4:
                System.out.println("Normal weight");
                break;
            case 5:
                System.out.println("Overweight");
                break;
            case 6: 
                System.out.println("Obesity class 1");
                break;
            case 7:
                System.out.println("Obesity class 2");
                break;
            case 8:
                System.out.println("Obesity class 3");
                break;
            default:
                System.out.println("BMI category not recognized");
                break;
        }
    }
}
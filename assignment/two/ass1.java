import java.util.Scanner;

public class ass1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int positiveCount = 0;
        int negativeCount = 0;
        int totalSum = 0;
        int totalCount = 0;
        
        while (true) {
            System.out.print("Enter an integer value:");
            int input = scanner.nextInt();
            
            if (input == 0) {
                break;
            }
            
            if (input > 0) {
                positiveCount++;
            } else if (input < 0) {
                negativeCount++;
            }
            
            totalSum += input;
            totalCount++;
        }

        double average = totalCount > 0 ? (double) totalSum / totalCount : 0;

        System.out.println("The number of positives is " + positiveCount);
        System.out.println("The number of negatives is " + negativeCount);
        System.out.println("The total is " + totalSum);
        System.out.println("The average is " + average);
    }
}

import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);

        int[] nums = new int[10];

        System.out.println("Enter 10 numbers:");

        for (int i = 0; i < 10; i++) {
            nums[i] = cin.nextInt();
        }

        int minVal = nums[0];

        for (int num : nums) {
            if (num < minVal) {
                minVal = num;
            }
        }

        System.out.println("The minimum value is:" + minVal);
    }
}
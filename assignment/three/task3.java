import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);

        double[] nums = new double[10];

        System.out.println("please enter 10 numbers:");

        for (int i = 0; i < 10; i++) {
            nums[i] = cin.nextDouble();
        }

        double minVal = min(nums);

        System.out.println("The minimum value is:" + minVal);
    }

    // method min

    public static double min(double[] arr) {
        double minVal = arr[0];

        for (double e : arr) {
            if (e < minVal) {
                minVal = e;
            }
        }
        return minVal;
    }
}
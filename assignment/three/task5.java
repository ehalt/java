import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class task5 {

    public static int[] readArr() {
        Scanner cin = new Scanner(System.in);
        
        System.out.print("Enter the array size: ");
        int size = cin.nextInt();
        
        if (size <= 0) {
            System.out.println("Array size must be greater than zero.");
            cin.close(); 
            return new int[0];
        }
        
        int[] arr = new int[size];
        
        System.out.println("Enter array elements:");
        for (int i = 0; i < size; i++) {
            arr[i] = cin.nextInt();
        }
        
        cin.close(); 
        
        return arr;
    }

    public static int[] randomShuffle(int[] arr) {
        List<Integer> list = new ArrayList<>();
        for (int e : arr) {
            list.add(e);
        }

        // Shuffling
        Collections.shuffle(list);

        for (int i = 0; i < arr.length; i++) {
            arr[i] = list.get(i);
        }
        
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = readArr();
        
        if (arr.length == 0) {
            System.out.println("No array to shuffle.");
            return;
        }
        
        arr = randomShuffle(arr);
        
        // Print the array using Arrays.toString
        System.out.println("Array elements:");
        System.out.println(Arrays.toString(arr));
    }
}

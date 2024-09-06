import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

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
        
        // Shuffle the array
        arr = randomShuffle(arr);

        // Print the shuffled array using Arrays.toString
        System.out.println("Shuffled array elements:");
        System.out.println(Arrays.toString(arr));

        // Sort the array
        Arrays.sort(arr);
        System.out.println("Sorted array elements:");
        System.out.println(Arrays.toString(arr));
        
        // Search for a specific value (e.g., 11)
        int key = 11;
        int index = Arrays.binarySearch(arr, key);
        if (index >= 0) {
            System.out.println("Element " + key + " found at index: " + index);
        } else {
            // Arrays.binarySearch returns -1 if not found
            System.out.println("Element " + key + " not found. Insertion index: " + (-index - 1));
        }
        
        // Compare with another array
        int[] arr2 = Arrays.copyOf(arr, arr.length); // Create a copy for comparison
        boolean areEqual = Arrays.equals(arr, arr2);
        System.out.println("Arrays are equal: " + areEqual);
        
        // Modify arr2 and compare again
        arr2[0] = arr2[0] + 1; // Modify arr2 to be different from arr
        areEqual = Arrays.equals(arr, arr2);
        System.out.println("Arrays are equal after modification: " + areEqual);
    }
}

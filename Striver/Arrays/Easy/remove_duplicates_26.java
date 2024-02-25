import java.util.*;
import java.util.Arrays;

// remove duplicates from the array and print the new array with no duplicates

public class remove_duplicates_26 {

    public static int[] removeDuplicates(int[] arr) {
        // Sort the array to bring duplicates together
        Arrays.sort(arr);

        // Count the number of unique elements
        int uniqueCount = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] != arr[i + 1]) {
                uniqueCount++;
            }
        }
        uniqueCount++; // Account for the last element

        // Create a new array to store unique elements
        int[] uniqueArray = new int[uniqueCount];

        // Copy unique elements to the new array
        uniqueArray[0] = arr[0];
        int index = 1;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[i - 1]) {
                uniqueArray[index++] = arr[i];
            }
        }

        return uniqueArray;
    }

    public static void main(String[] args){
    
        int[] arr = {1, 2, 3, 3, 4, 4, 5};

        int[] uniqueArray = remove_duplicates_26.removeDuplicates(arr);
        
        // Print the unique array
        for (int num : uniqueArray) {
            System.out.print(num + " ");
        }
    }
}

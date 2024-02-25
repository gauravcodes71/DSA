
import java.util.*;
    
/*
public class second_largest_smallest{

    // find the larget number function

    static int findmax(int[] arr){
        int mx = Integer.MIN_VALUE;
        for(int i = 0; i < arr.length;i++){
            if(arr[i] > mx){
                mx = arr[i];
            }
        }
        return mx;
    }

    // find the second max function
    static int findSecondMax(int[] arr){
        int mx = findmax(arr);
        for(int i = 0 ; i < arr.length;i++){
            if(arr[i] == mx){
                arr[i] = Integer.MIN_VALUE;
            }
        }

        int secondMax = findmax(arr);
        return secondMax;
    }


        //  function for the smallest element in the array
        public static int findMin(int[] arr){
            int min = Integer.MAX_VALUE;

            for(int i =0; i < arr.length;i++){
                if(arr[i] < min){
                    min = arr[i];
                }
            }
            return min;
        }


        // find the second smallest element in the array 
        public static int findSecondMin(int[] arr){
            int min = findMin(arr);
            for(int i = 0; i < arr.length;i++){
                if(arr[i] == min){
                    arr[i] = Integer.MAX_VALUE;
                }
            }

            int secondMin = findMin(arr);
            min = secondMin;

            return min;
        }

    public static void main(String[] args){
        int arr[]  = {10,2,3,4,5};
        int arr1[]  = {10,2,3,4,5};

       System.out.println("the largest element in the array is " + findmax(arr));
       System.out.println("the smallest element in the array is "  + findMin(arr1));

       System.out.println("the second larget element in the array is " + findSecondMax(arr));
       System.out.println("the second smallest element in the array is " + findSecondMin(arr1));
    }
}

*/

public class second_largest_smallest {

    public static void findSecondLargestAndSmallest(int[] arr) {
        if (arr == null || arr.length < 2) {
            System.out.println("Array doesn't have enough elements.");
            return;
        }

        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int secondMin = Integer.MAX_VALUE;

        for (int num : arr) {
            // Update for largest and second largest
            if (num > max) {
                secondMax = max;
                max = num;
            } else if (num > secondMax && num != max) {
                secondMax = num;
            }

            // Update for smallest and second smallest
            if (num < min) {
                secondMin = min;
                min = num;
            } else if (num < secondMin && num != min) {
                secondMin = num;
            }
        }

        System.out.println("Second largest element: " + secondMax);
        System.out.println("Second smallest element: " + secondMin);
    }

    public static void main(String[] args) {
        int[] arr = {10, 2, 3, 4, 5};

        findSecondLargestAndSmallest(arr);
    }
}

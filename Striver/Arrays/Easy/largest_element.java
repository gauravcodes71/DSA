// package Easy;

import java.util.*;
import java.util.Scanner;

// print the largest element in the array 

public class largest_element {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the size of the array");
            int n = sc.nextInt();
            int arr[] = new int[n];

            System.out.println("Enter the " + n + " of elements ");
            for(int i = 0 ; i < n;i++){
                arr[i] = sc.nextInt();
            }

            int ans = arr[0];

            for(int i = 0 ; i<= arr.length-1;i++){
                if (arr[i] >ans) {
                    ans = arr[i];
                }
            }
            System.out.println("the larget element in the aray is : " + ans );
    }
}

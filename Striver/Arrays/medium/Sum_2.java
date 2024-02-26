package Striver.Arrays.medium;

import java.util.*;

// leetcode 1. 2Sum problem 

public class Sum_2{
    public static void main(String[] args){
        int arr[] = {1,2,34,5,7,2};
        Scanner sc = new Scanner (System.in);
        System.out.println("enter the target value");
        int target = sc.nextInt();

        for(int i = 0;i< arr.length;i++){
            for(int j = i+1;j < arr.length;j++){
                if(arr[i] + arr[j] == target){
                    System.out.println("YES");
                }
            }
        }
        System.out.println("NO");
    }
}
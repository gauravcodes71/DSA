package Striver.Arrays.hard;

import java.util.*;

public class Reverse_pairs_493{
    public static void main(String[] args) {
        // int arr[] ={100,49,201,100};
        int arr[] = {4,1,2,3,1};
        int n = 0;

        for(int i = 0;i< arr.length;i++){
            for(int j =1;j < arr.length;j++){
                if(i<j && arr[i] > 2*arr[j]){
                    // System.out.println("counts are ");
                    n++;
                }
            }
        }
        System.out.println(n);
    }
}
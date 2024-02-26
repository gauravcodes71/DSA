// find the missing number in the given array 
// leetcode 268 problem easy 

// brutforce approach 
 
import java.util.*;

public class missing_number_268{

    // using hashing 
    public static int findMissingNumber(int[] nums) {
        // Create a hash map to store the occurrence of each number
        HashMap<Integer, Integer> map = new HashMap<>();
        
        // Iterate through the array and store the occurrence of each number
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        
        // Iterate from 1 to n+1 and check if each number exists in the hash map
        int n = nums.length;
        for (int i = 1; i <= n + 1; i++) {
            if (!map.containsKey(i)) {
                return i; // Missing number found
            }
        }
        
        // If no missing number is found, return -1 (or any other suitable value)
        return -1;
    }

    // better than previous using summaiton method 
    public static int findMissingNumberSum(int[] nums) {
        int n = nums.length + 1; // Length of the array plus one
        int expectedSum = (n * (n + 1)) / 2; // Expected sum of all integers from 1 to n
        
        int actualSum = 0;
        for (int num : nums) {
            actualSum += num; // Calculate the sum of all elements in the array
        }
        
        return expectedSum - actualSum; // Return the missing number
    }

    // more optimal way using xor 
    public static int findMissingNumberxor(int[] nums) {
        int n = nums.length;
        int xorResult = 0;

        // XOR all numbers from 1 to n (inclusive)
        for (int i = 1; i <= n + 1; i++) {
            xorResult ^= i;
        }

        // XOR all numbers in the array
        for (int num : nums) {
            xorResult ^= num;
        }

        return xorResult;
    }


    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};

// brutforce method 
        for(int i = 1 ; i <= arr.length;i++){
            int flag = 0 ;
            for(int j = 0 ; j < arr.length-1;j++ ){
                if(arr[j] == i){
                    flag = 1;
                    break;
                }
            }
            if(flag == 0){
                System.out.println(i);
            }
        }


//better way to approach this problem is 
int[] nums = {3, 7, 1, 2, 8, 4, 5};
int missingNumber = findMissingNumberxor(nums);
System.out.println("Missing number is: " + missingNumber);

    }
}
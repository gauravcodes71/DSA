
import java.util.*;

// check if the given array is sort or not 
public class sort_array_check_1752{

    static boolean sortArray(int[] arr){
        if(arr == null || arr.length < 2){
            return true;
        }

        for(int i = 0 ;i< arr.length;i++){
            if(arr[i] > arr[i+1]){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,2};

        System.out.println(sortArray(arr));
    }
}
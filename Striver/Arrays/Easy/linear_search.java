

public class linear_search {
    // check if the target element is present or not if yes print the index value
   public static void main(String[] args){
    int arr[] = {1,2,3,4,5,1,6};
    int target = 10;
    int ans = 0;

    for(int i = 0 ; i <= arr.length-1;i++){
        if(arr[i] == target){
            ans = i;
            break;
        }
        else{
            ans = -1;
        }
     }
     System.out.println(ans);
    }
}

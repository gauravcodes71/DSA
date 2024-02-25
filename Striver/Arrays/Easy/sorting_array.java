public class sorting_array {

    static void swap(int[] arr,int i , int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args){
    int arr[] = {1,2,3,3,42,1,4,0,1};

        for(int i = 0 ; i < arr.length;i++){
            for(int j = i + 1 ; j < arr.length;j++){
                if( arr[i] > arr[j]){
                    swap(arr, i, j);
                }
              }
            }
            
            for(int i= 0 ; i < arr.length;i++){
                System.out.print(arr[i]  + " ");
             }
        }
    }


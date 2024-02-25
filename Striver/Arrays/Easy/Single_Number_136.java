// leet code 136 problem 

class Solution {
    public int singleNumber(int[] arr) {
          for(int i = 0; i < arr.length; i++) {
            int num = arr[i];
            boolean found = false;
            for(int j = 0; j < arr.length; j++) {
                if(i != j && arr[j] == num) {
                    found = true;
                    break;
                }
            }
            if(!found) {
                return num;
            }
        }
        // If no single element found, you may handle it accordingly, 
        // for now, returning -1 as a default value.
        return -1;
    }
}
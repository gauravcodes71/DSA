// check if the given array is sort and rotated and return true or false 
// leetcode 1752 problem

class sort_Rotate_1752 {
    public boolean check(int[] nums) {
        int i = 0, flag = 0, n = nums.length;
        boolean status = true;
        while(i<n-1){
            if(flag == 0){
                if(nums[i] > nums[i+1]){
                    flag = 1;
                }
            }else{
                if(nums[0] < nums[i] || nums[i] > nums[i+1])                 {
                    status = false;
                    break;
                }
            }
            i++;
        }
        if(flag == 1 && nums[0] < nums[i]) status = false;
        return status;
    }
}
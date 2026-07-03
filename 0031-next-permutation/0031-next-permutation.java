class Solution {
    public void nextPermutation(int[] nums) {

        int n =nums.length;
        //int temp=0;
        int pivot=-1;
       // int reverse=0;
        // int right =n-1;
        // int left=0;
        // int pivot =-1;
        for(int i=n-2; i >=0; i--){
            if(nums[i] < nums[i+1]){
                // temp = nums[i];
                // nums[i]= nums[i+1];
                // nums[i+1]= temp;
                
                pivot =i;
                break;
            }
        }
        if(pivot ==-1){
            reverse(nums,0 ,n-1);
            return;
        }
        for(int j= n-1; j> pivot; j--){
            if(nums[j] > nums[pivot]){
                swap(nums,j,pivot);
                break;
            }
        }
        reverse(nums, pivot+1,n-1);
    }
    private void swap(int[] nums,int i,int j){
        int temp= nums[i];
        nums[i]= nums[j];
        nums[j]= temp;
    }
    public void reverse(int[] nums, int left,int right){

        while(left<right){

            int temp= nums[left];
            nums[left]= nums[right];
            nums[right]= temp;

            left++;
            right--;

        }
    }
}
class Solution {
    public int removeDuplicates(int[] nums) {
        // int i =0;

        // for(int j =1; j<nums.length;j++){
        //     if(nums[j]!= nums[i]){
        //         nums[i+1]=nums[j];
        //         i++;
        //     }
        // }
        // return i+1;

        // int [] arr= new int[nums.length];
        // for(int i=0; i<nums.length-1;i++){
        //     if(nums[i] == nums[i+1]){
        //         arr[i]= nums[i];
        //     }else{
        //         arr[i]= nums[i+1];
        //     }
        // }
        // return arr.length;
        int j=1;
        for(int i=1; i<nums.length;i++){
            if(nums[i]!= nums[i-1]){
                nums[j]= nums[i];
                j++;
            }
        }
        return j;
    }
}
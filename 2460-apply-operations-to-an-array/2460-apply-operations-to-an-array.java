class Solution {
    public int[] applyOperations(int[] nums) {
        // int[] ans = new int[nums.length];
        int i=0;
        int j= 1;

        while(j< nums.length){
            if(nums[i]== nums[j]){
                nums[i]= nums[i]*2;
                nums[j]=0;
                i++;
                j++;
            }else{
                i++;
                j++;
            }
        }
        i=0;
        j=0;
        while(j<nums.length){
            if(nums[j]!= 0){
                nums[i]= nums[j];
                i++;
            }
            j++;
        }
        while(i<nums.length){
            nums[i]=0;
            i++;
        }
        return nums;
    }
}
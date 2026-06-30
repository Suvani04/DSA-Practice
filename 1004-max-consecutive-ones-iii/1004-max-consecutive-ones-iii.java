class Solution {
    public int longestOnes(int[] nums, int k) {
       // int sum=0;
        int maxLength= Integer.MIN_VALUE;
        int left=0;
        int zeroCount=0;
        for(int right=0; right<nums.length; right++){
            //sum += nums[right];
            // nums[right]== 0;
            // zeroCount++;
            if(nums[right]==0){
                zeroCount++;
            }
            while(zeroCount >k){
                if(nums[left]==0){
                  //  left++;
                    zeroCount--;
                }
                left++;
            }
            maxLength = Math.max(maxLength, right - left + 1);
        }
        return maxLength;
    }
}
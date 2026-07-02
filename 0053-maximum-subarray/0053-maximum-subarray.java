class Solution {
    public int maxSubArray(int[] nums) {
        int currentSum =0;
        int maxSum=nums[0];
        int n = nums.length;
        // 'if(currentSum ==maxSum){
        //     return 1;
        // }
        for(int i =0; i<n;i++){
            if(currentSum <0){
                currentSum=0;
            }
            currentSum += nums[i];
            if(currentSum >maxSum){
               // currentSum = maxSum;
               maxSum = currentSum;
            }
        }
        return maxSum;
    }
}
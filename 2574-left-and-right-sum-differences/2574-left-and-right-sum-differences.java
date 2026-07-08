class Solution {
    public int[] leftRightDifference(int[] nums) {
        int rightSum=0;
        int leftSum=0;
        int totalSum=0;
        int n = nums.length;
        int[] ans = new int[n];
        for(int i=0; i<n; i++){
            totalSum += nums[i];
        }
        for(int i=0; i<n; i++){
            rightSum = totalSum-leftSum-nums[i];

            ans[i]= Math.abs(leftSum - rightSum);
            leftSum += nums[i];
        }
        return ans;
    }
}

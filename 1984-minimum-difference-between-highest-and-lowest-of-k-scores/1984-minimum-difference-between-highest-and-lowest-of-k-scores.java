
class Solution {
    public int minimumDifference(int[] nums, int k) {
        Arrays.sort(nums);
        int ans = Integer.MAX_VALUE;
        // int sum=0;
        // int diff=0;
        // int highest= nums[i+k+1];
        // int lowest= nums[i];
        for(int i=0; i<=nums.length-k;i++){
            int highest= nums[i+k-1];
            int lowest= nums[i];
            // nums[highest]-nums[lowest];
            int diff= highest-lowest;
            ans= Math.min(ans, diff);
        }
        return ans;
    }
}
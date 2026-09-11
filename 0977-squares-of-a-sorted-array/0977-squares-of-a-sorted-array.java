class Solution {
    public int[] sortedSquares(int[] nums) {
        // int left=0;
        // int right=nums.length-1;
        // int index=nums.length-1;
        // int [] result= new int[ nums.length];

        // while(left<=right){
        //     int leftSquare= nums[left]*nums[left];
        //     int rightSquare = nums[right]* nums[right];

        //     if(leftSquare< rightSquare){
        //         result[index]=rightSquare;
        //         right--;
        //     }else{
        //         result[index]= leftSquare;
        //         left++;
        //     }
        //     index--;
        // }
        // return result;
        int[] ans = new int[nums.length];
        for(int i=0; i<nums.length;i++){
            ans[i]= nums[i]*nums[i];
        }
        Arrays.sort(ans);
        return ans;
    }
}
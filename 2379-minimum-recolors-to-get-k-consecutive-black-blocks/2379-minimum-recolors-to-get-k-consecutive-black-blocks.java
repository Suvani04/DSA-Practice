class Solution {
    public int minimumRecolors(String blocks, int k) {
        int whiteCount=0;
        for(int i=0;i<k;i++){
            if(blocks.charAt(i)=='W'){
                whiteCount++;
            }
        }
        int ans=whiteCount;
        for(int right=k;right<blocks.length();right++){
            // whiteCount=whiteCount-blocks.charAt(right-1)+blocks.charAt(right+k-1);
            if (blocks.charAt(right - k) == 'W'){
                whiteCount--;
            }
            if(blocks.charAt(right)=='W'){
                whiteCount++;
            }
            ans=Math.min(ans,whiteCount);
        }
        return ans;
    }
}
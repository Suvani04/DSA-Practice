class Solution {
    public String firstPalindrome(String[] words) {
        // int l=0;
        // int r=words.length()-1;

        for(int i=0; i<words.length;i++){
            String word= words[i];
            int l=0;
            int r=word.length()-1;
            boolean isPalindrome= true;

            while(l<=r){
                if(word.charAt(l)==word.charAt(r)){
                    l++;
                    r--;
                }else{
                    isPalindrome= false;
                    break;
                }
            }
            if(isPalindrome){
                return word;
            }
        }
        return "";
    }
}
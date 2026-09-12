class Solution {
    public String reverseWords(String s) {
        String[] words= s.split(" ");
        for(int i=0; i<words.length;i++){
            String word= words[i];
            int l=0;
            int r=word.length()-1;
            char[] arr= word.toCharArray();
            while(l<r){
                // char[] arr= word.toCharArray();
                char temp= arr[l];
                arr[l]= arr[r];
                arr[r]= temp;

                l++;
                r--;
                
            }
            words[i]=new String(arr);
        }
        return String.join(" ", words);
    }
}
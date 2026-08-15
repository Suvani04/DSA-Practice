class Solution {
    public boolean isSubsequence(String s, String t) {
        int i=0;
        int j=0;

        while(i<s.length() && j<t.length()){
            if(s.charAt(i)==t.charAt(j)){
                // s.charAt(i);
                i++;
                j++;
            }else{
                j++;
            }
            // if(s.charAt(i) != t.charAt(j)){
            //     // s.charAt(i);
            //     j++;
            // }
            // return true;
            // if(i== s.length()){
            //     return true;
            // }
        } 
        return i == s.length();
    }
}
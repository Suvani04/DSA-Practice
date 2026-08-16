class Solution {
    public int countSeniors(String[] details) {
        int count =0;

        for(String s : details){
            char first= s.charAt(11);
            char second = s.charAt(12);

            int age= (first -'0') *10 + (second -'0');

            if(age >60){
                count++;
            }
        }
        return count;
    }
}
class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character, Character> map = new HashMap<>();
        HashMap<Character, Character> sap= new HashMap<>();

        for(int i=0; i<s.length();i++){
            char sc= s.charAt(i);
            char tc= t.charAt(i);

            if(map.containsKey(sc) && map.get(sc) !=tc){
                return false;
            }
            if(sap.containsKey(tc) && sap.get(tc) != sc){
                return false;
            }
            map.put(sc,tc);
            sap.put(tc,sc);
        }
        return true;
    }
}
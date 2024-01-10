class Solution {
    public boolean isIsomorphic(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }

        HashMap<Character, Character> map = new HashMap<>();
        HashMap<Character, Boolean> mapB = new HashMap<>();
        for(int i = 0; i<s.length(); i++){
            char sc = s.charAt(i);
            char tc = t.charAt(i);
            if(map.containsKey(sc)){
                if(map.get(sc) != tc){
                    return false;
                }
            }else{
                if(mapB.containsKey(tc)){
                    return false;
                }else{
                    map.put(sc,tc);
                    mapB.put(tc,true);
                }
            }
        }
        return true;
    }
}
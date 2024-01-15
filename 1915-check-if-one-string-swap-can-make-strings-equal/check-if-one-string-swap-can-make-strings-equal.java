class Solution {
    public boolean areAlmostEqual(String s1, String s2) {
        if(s1.length() != s2.length()){
            return false;
        }
        if(s1.equals(s2)){
            return true;
        }
        ArrayList<Integer> l = new ArrayList<>();
        for(int i = 0; i<s1.length(); i++){
            if(s1.charAt(i) != s2.charAt(i)){
                l.add(i);
            }
            if(l.size() > 2){
                return false;
            }
        }

        if(l.size() == 2 && s1.charAt(l.get(0)) == s2.charAt(l.get(1)) && s1.charAt(l.get(1)) == s2.charAt(l.get(0)) ){
            return true;
        }
        return false;
        
    }
}
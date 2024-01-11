class Solution {
    public boolean rotateString(String s, String goal) {
        if(s.equals(goal)){
            return true;
        }
        if(s.length() != goal.length()){
            return false;
        }
        for(int i = 1; i<s.length(); i++){
            
            String d = "";
            d += s.substring(i);
            d += s.substring(0,i);
            if(d.equals(goal)){
                return true;
            }
        }
        return false;
    }
}
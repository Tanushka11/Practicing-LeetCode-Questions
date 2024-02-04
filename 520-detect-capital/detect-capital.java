class Solution {
    public boolean detectCapitalUse(String word) {
        if(first(word) || second(word) || third(word)){
            return true;
        }
        return false;
    }
    boolean first(String w){
        for(int i = 0; i<w.length(); i++){
            char ch = w.charAt(i);
            if(Character.isLowerCase(ch)){
                return false;
            }
        }
        return true;
    }
    boolean second(String w){
        for(int i = 0; i<w.length(); i++){
            char ch = w.charAt(i);
            if(Character.isUpperCase(ch)){
                return false;
            }
        }
        return true;
    }
    boolean third(String w){
        String str = w.substring(1);
        char ch = w.charAt(0);
        if(Character.isUpperCase(ch) && second(str)){
            return true;
        }
        return false;
    }
}
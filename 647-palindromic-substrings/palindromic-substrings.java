class Solution {
    public Boolean isPallindrome(String s){
        int i = 0;
        int j = s.length() - 1;
        while(i < j ){
            if(s.charAt(i) != s.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
    public int countSubstrings(String s) {
        int count = 1;
        int len = s.length();
        for(int i = 0; i < len - 1; i++){
            String ss = s.charAt(i) + ""; 
            count++;
            for(int j = i+1; j<len; j++){
                ss += s.charAt(j) + "";
                if(isPallindrome(ss)) {
                    
                    count ++;
                }
            }
        }
        return count;
    }
}
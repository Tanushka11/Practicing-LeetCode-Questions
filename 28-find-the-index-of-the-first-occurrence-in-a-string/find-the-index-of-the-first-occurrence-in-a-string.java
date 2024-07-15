class Solution {
    public int strStr(String haystack, String needle) {
        if(needle.length() > haystack.length()) return -1;
        
        for(int i = 0; i<haystack.length(); i++){
            int j = i+1;
            while(j <= haystack.length() ){
            String s = haystack.substring(i,j);
                
                if(s.equals(needle)) return i;
                j++;
            }
        }
        return -1;
    }
}
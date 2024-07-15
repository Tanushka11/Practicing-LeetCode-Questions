class Solution {
    public int strStr(String haystack, String needle) {
        if(needle.length() > haystack.length()) return -1;
        if(needle.length() == haystack.length() && needle.equals(haystack)) return 0;

        int n = needle.length();
        for(int i = 0; i<(haystack.length() - needle.length())+ 1; i++){
           if(haystack.substring(i,i+n).equals(needle)) return i;
        }
        return -1;
    }
}
class Solution {
    public String getEncryptedString(String s, int k) {
       StringBuilder sb = new StringBuilder();
       int n = s.length();
       for(int i = 0; i<s.length(); i++){
        int ci = (i+k) % n;
        char ch = s.charAt(ci);
        sb.append(ch);
       }
       return sb.toString();
    }
}
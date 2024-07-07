class Solution {
    public String shortestBeautifulSubstring(String s, int k) {
        int n = s.length();
       int i = 0;
       int j = 0;
       int count = 0;
       String ans = "";
        while(j < n){
            if(s.charAt(j) == '1') count++;
           if(count == k){
             while(i<n && count == k){
                String str = s.substring(i,j+1);
                if(ans.isEmpty() || (str.length() < ans.length())){
                    ans = str;
                }
                else if(str.length() == ans.length()) {
                //     int v1 = Integer.valueOf(str);
                //     int v2 = Integer.valueOf(ans);
                //     ans = (v1 < v2) ? str : ans;
                   ans = (ans.compareTo(str) < 0) ? ans : str;
                }
                if(s.charAt(i) == '1') count--;
                i++;
            }
           }
            j++;
        }
        return ans;
    }
}
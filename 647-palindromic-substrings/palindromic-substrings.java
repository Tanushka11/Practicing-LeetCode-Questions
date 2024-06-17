class Solution {
    public int countSubstrings(String s) {
        int count = 0;
     int len = s.length();
     String ss = "";
     for(int mid  = 0; mid < len; mid++){
        int i = mid - 1;
        int j = mid + 1;
         count ++;
        while(i >= 0 && j < len && s.charAt(i) == s.charAt(j)){
            i--;
            j++;
            count ++;
        }
     }

     for(int mid  = 0; mid < len; mid++){
        int i = mid;
        int j = mid + 1;
        while(i >= 0 && j < len && s.charAt(i) == s.charAt(j)){
            i--;
            j++;
            count ++;
        }
     }
     return count;
    }
}
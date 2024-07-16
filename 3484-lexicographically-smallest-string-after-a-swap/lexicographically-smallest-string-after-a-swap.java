class Solution {
    public String getSmallestString(String s) {
        char[] arr = s.toCharArray();
        for(int i = 1; i<s.length(); i++){
            char prev = s.charAt(i-1);
            char curr = s.charAt(i);
            int p = Character.valueOf(prev);
            int c = Character.valueOf(curr);
            if(c < p && parity(c,p)){
                swap(arr, i, i-1);
                StringBuilder ans = new StringBuilder();
                for(char ch : arr){
                    ans.append(ch);
                }
                return ans.toString();
            }
        }
        
        return s;
    }
    Boolean parity(int one , int two){
        if(one % 2 == 0 && two % 2 == 0) return true;
        if(one % 2 != 0 && two % 2 != 0) return true;
        return false;
    }
    void swap(char[] arr, int i , int j){
        char temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
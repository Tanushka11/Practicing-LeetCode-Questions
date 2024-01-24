class Solution {
    public long[] kthPalindrome(int[] queries, int intLength) {
        int p = (intLength+1)/2;
        int leftLimit = (int) Math.pow(10, p-1);
        int rightLimit = (int) Math.pow(10, p) - 1;

        long[] kthPalindromes = new long[queries.length];
        String ans = "";
        int k = 0;
        for(int q : queries){
            if(q <= (rightLimit - leftLimit) + 1){
                ans = Integer.toString(leftLimit + q - 1);
                String reverse = rev(ans, intLength - ans.length());
                ans = ans + reverse;
                kthPalindromes[k++] = Long.parseLong(ans);
                
            }else{
                kthPalindromes[k++] = -1;
            }
            
        }
        return kthPalindromes;
    }
    String rev(String s , int n){
        String r = "";
        for(int i = 0; i<n; i++){
            char ch = s.charAt(i);
            r = ch + r;
        }
        return r;
    }
}
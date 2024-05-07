//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            int N = Integer.parseInt(read.readLine());
            Solution ob = new Solution();
            System.out.println(ob.isDigitSumPalindrome(N));
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    int isDigitSumPalindrome(int n) {
        // code here
        int sum = 0;
        String s = Integer.toString(n);
        for(int i = 0; i<s.length(); i++){
            int num = Character.getNumericValue(s.charAt(i));
            sum += num;
        }
        
        if(isPallindrom(sum)){
            return 1;
        }
        return 0;
    }
    static boolean isPallindrom(int num){
        String s = Integer.toString(num);
        int i = 0;
        int j = s.length() - 1;
        while(i<j){
            if(s.charAt(i) != s.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
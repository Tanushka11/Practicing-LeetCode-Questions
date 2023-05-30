//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String S = read.readLine();
            
            Solution ob = new Solution();
            System.out.println(ob.isPalindrome(S));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution {
    int isPalindrome(String S) {
        // code here
        if(S.length() == 0 || S.length() == 1){
            return 1;
        }
         if(pal(0,S.length()-1,S)){
             return 1;
         }
         return 0;
    }
    static boolean pal(int i,int j,String s){
        if(i>j){
            return true;
        }
        if(s.charAt(i) != s.charAt(j)){
            return false;
        }
        return pal(i+1,j-1,s);
       
    }
};
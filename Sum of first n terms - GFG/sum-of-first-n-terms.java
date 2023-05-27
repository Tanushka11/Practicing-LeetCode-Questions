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
            System.out.println(ob.sumOfSeries(N));
        }
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    long sumOfSeries(long N) {
        // code here
        long ans = sum(N,0);
        return ans;
        
        
    }
    static long sum(long n, long s){
        
        if(n<1){
            return s;
        }
        return sum(n-1, s + (long)Math.pow(n,3));
    }
}
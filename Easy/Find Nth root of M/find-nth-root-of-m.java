//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while(T-->0)
        {
            String s = br.readLine().trim();
            String[] S1 = s.split(" ");
            int n = Integer.parseInt(S1[0]);
            int m = Integer.parseInt(S1[1]);
            Solution ob = new Solution();
            int ans = ob.NthRoot(n, m);
            System.out.println(ans);
        }
    }
}

// } Driver Code Ends


//User function Template for Java

class Solution
{
    public int NthRoot(int n, int m)
    {
        // code here
        int start = 1;
        int end = m;
        while(start <= end){
            int mid = start + (end - start)/2;
            long res = function(mid,m,n);
            if(res == 0){
                return mid;
            }
            else if(res == 1){
                start = mid + 1;
            }else{
                end = mid -1;
            }
        }
        return -1;
        
    }
    static long function(int mid , int m, int n){
        long prod =1;
        for(int i = 1; i<=n ; i++){
            prod = prod * mid;
            if(prod > m)
            return 2;
        }
        if(prod == m){
            return 0;
        }
       
            return 1;
        
        
        
    }
}
//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    // Driver code
    public static void main(String[] args) throws Exception {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());
            String[] str = br.readLine().trim().split(" ");
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = Integer.parseInt(str[i]);
            }

            int ans = new Solution().findKRotation(a, n);
            System.out.println(ans);
        }
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    int findKRotation(int arr[], int n) {
        // code here
        
        int s = 0;
        int e = n-1;
        while(s<=e){
            int m = s +(e-s)/2;
            if(m > s && arr[m-1] > arr[m]){
                return m;
            }else if(m<e && arr[m] > arr[m+1]){
                return m + 1;
            }else if(arr[0] < arr[m]){
                s = m+1;
            }else{
                e = m-1;
            }
        }
        return 0;
    }
}
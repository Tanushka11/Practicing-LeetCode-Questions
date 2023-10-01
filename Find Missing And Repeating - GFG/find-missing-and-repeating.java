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
            String[] str = br.readLine().split(" ");

            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = Integer.parseInt(str[i]);
            }

            int[] ans = new Solve().findTwoElement(a, n);
            System.out.println(ans[0] + " " + ans[1]);
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solve {
    int[] findTwoElement(int arr[], int n) {
        // code here
        Arrays.sort(arr);
        int[] ans = new int[2];
        int[] count = new int[n];
        for(int i=0; i<n; i++){
            int x = arr[i];
            if(x <= n){
                count[x-1] += 1;
            }
        }
        for(int i =0; i<n; i++){
            if(count[i] > 1){
                ans[0] = i+1;
            }else if(count[i] == 0){
                ans[1] = i+1;
            } 
        }
        
        return ans;
    }
}
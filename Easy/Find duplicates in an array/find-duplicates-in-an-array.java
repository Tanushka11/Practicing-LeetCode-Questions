//{ Driver Code Starts
import java.io.*;
import java.util.*;
import java.util.Map.Entry;

class GFG {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) a[i] = sc.nextInt();
            Solution g = new Solution();
            ArrayList<Integer> ans = g.duplicates(a, n);
            for (Integer val : ans) System.out.print(val + " ");
            System.out.println();
        }
    }
}

// } Driver Code Ends


class Solution {
    public static ArrayList<Integer> duplicates(int arr[], int n) {
        // code here
         Arrays.sort(arr);
        ArrayList<Integer> ans = new ArrayList<>();
         int prev = -1;
       for(int i = 1; i<n; i++){
           if(arr[i-1] == arr[i]  && arr[i] != prev){
               ans.add(arr[i-1]);
               prev = arr[i];
           }
       }
       
        if(ans.isEmpty()){
            ans.add(-1);
            return ans;
        }
        return ans;
    }
}

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
    int[] findTwoElement(int nums[], int n) {
       int[] ans=new int[2];
     CyclicSort(nums);
     for(int i=0;i<nums.length;i++){
         if(nums[i] != i+1 ){
             ans[0]=nums[i];
             ans[1]=i+1;
         }
     }
     return ans;
     
    }
    static void CyclicSort(int[] nums){
        int i=0;
        while(i<nums.length){
            int ci = nums[i] - 1;
            if(nums[i] != nums[ci]){
                swap(nums,i,ci);
            }
            else{
                i++;
            }
        }
    }
    static void swap(int [] nums, int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}

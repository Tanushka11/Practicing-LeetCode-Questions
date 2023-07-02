//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main(String[] args) throws IOException
	{
	        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t =
            Integer.parseInt(br.readLine().trim()); // Inputting the testcases
        while(t-->0)
        {
            int n = Integer.parseInt(br.readLine().trim());
            int a[] = new int[n+5];
            String inputLine[] = br.readLine().trim().split(" ");
            for (int i = 0; i < n-1; i++) {
                a[i] = Integer.parseInt(inputLine[i]);
            }
            
            Compute obj = new Compute();
            System.out.println(obj.missingNumber(a, n));
            
        }
	}
}


// } Driver Code Ends


//User function Template for Java


class Compute {
    
    public static int missingNumber(int A[], int n)
    {
         // Your code goes here
         int i = 0;
         while(i<n){
             if(A[i] != i+1 && A[i] <= n && A[i] > 0){
                 swap(A, i, A[i] - 1);
             }
             else {
                 i++;
             }
         }
         for(int k = 0;k<n;k++){
             if(A[k] != k+1){
                 return k+1;
             }
         }
         return n+1;
    }
    static void swap(int[] A , int i, int j){
        int temp = A[i];
        A[i] = A[j];
        A[j] = temp;
    }
}
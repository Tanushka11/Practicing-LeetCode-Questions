//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;


class GFG
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0)
        {
            String S[] = read.readLine().split(" ");
            int R = Integer.parseInt(S[0]);
            int C = Integer.parseInt(S[1]);
            int matrix[][] = new int[R][C];
            int c = 0;
            for(int i = 0; i < R; i++){
                String line[]=read.readLine().trim().split(" ");
                for(int j = 0; j < C; j++){
                    matrix[i][j] = Integer.parseInt(line[j]);
                }
            }
            Solution ob = new Solution();
            int ans = ob.median(matrix, R, C);
            System.out.println(ans);
        }
    }
}

// } Driver Code Ends


//User function Template for Java

class Solution {
    int median(int matrix[][], int R, int C) {
        // code here  
        int start = findMin(matrix, 0);
        int end = findMax(matrix, matrix[0].length - 1);
        
        while(start <= end){
             int mid = start + (end - start)/2;
             int SmallerOrEquals = findSmallerOrEquals(matrix, mid);
             if(SmallerOrEquals <= (R*C)/2){
                 start = mid+1;
             }else if(SmallerOrEquals > (R*C)/2){
                 end = mid - 1;
             }
        }
        return start;
    }
    static int findSmallerOrEquals(int[][] matrix,int mid){
     int count = 0;
     for(int r =0; r < matrix.length; r++){
         count += justGreater(matrix , mid , r);
     }
     return count;
    }
    
    static int justGreater(int[][] matrix , int elem, int r){
        int ans = 0;
        int start = 0;
        int end = matrix[0].length - 1;
        while(start <= end){
            int mid = start + (end - start)/2;
            if(matrix[r][mid] <= elem){
                start = mid + 1;
            }else if(matrix[r][mid] > elem){
                end = mid -1;
            }
        }
        return start;
    }
    
    static int findMax(int[][] matrix, int c){
        int max = -1;
        for(int i = 0; i<matrix.length; i++){
            max = Math.max(matrix[i][c] , max);
        }
        return max;
    }
    static int findMin(int[][] matrix, int c){
        int min = Integer. MAX_VALUE;
        for(int i = 0; i<matrix.length; i++){
            min = Math.min(matrix[i][c] , min);
        }
        return min;
    }
}

//{ Driver Code Starts
//Initial Template for Java



import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine().trim());
        while (tc-- > 0) {
            String[] inputLine;
            inputLine = br.readLine().trim().split(" ");
            int n = Integer.parseInt(inputLine[0]);
            int x = Integer.parseInt(inputLine[1]);
            int[] arr = new int[n];
            inputLine = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(inputLine[i]);
            }

            int ans = new Solution().count(arr, n, x);
            System.out.println(ans);
        }
    }
}

// } Driver Code Ends


//User function Template for Java



class Solution {
    int count(int[] arr, int n, int x) {
        // code here
        int[] fl = {-1,-1};
        fl[0] = search(arr,x,true);
        if(fl[0] == -1){
            return 0;
        }
       else{
            fl[1] = search(arr,x,false);
        }
        int ans = (fl[1] - fl[0]) + 1;
        return ans;
    }
    static int search(int[] arr, int x, boolean direction){
        int index = -1;
    int s = 0;
    int e = arr.length-1;
        while(s<=e){
            int m =  s + (e-s)/2;
            if(arr[m] < x){
                s = m+1;
            }else if(arr[m] > x){
                e = m-1;
            }else{
                index = m;
                if(direction){
                    e = m-1;
                }else{
                    s = m+1;
                }
            }
        }
        return index;
    }
    
}
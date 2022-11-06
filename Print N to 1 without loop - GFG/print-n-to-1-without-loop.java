//{ Driver Code Starts
import java.io.*;
import java.util.*;

class Main {
    // Driver code
    public static void main(String[] args) throws Exception {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while (t-- > 0) {
            int N = Integer.parseInt(br.readLine().trim());
            Solution obj = new Solution();
            obj.printNos(N);
            System.out.println();
        }
    }
}
// } Driver Code Ends


class Solution {

    void printNos(int N) {
        // code here
        int i = 1;
        func(i,N);
    }
    void func(int i, int n){
        if(i>n){
            return;
        }
        func(i+1, n);
        System.out.print(i + " ");
    }
}
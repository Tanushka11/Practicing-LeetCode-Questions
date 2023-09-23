//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.io.*;

class GFG{
	public static void main(String [] args) throws IOException{
		Scanner sc = new Scanner(System.in);
		int test = sc.nextInt();
		while(test-- > 0) {
			int N = sc.nextInt();
			Solution obj = new Solution();
			obj.toBinary(N);
			System.out.println();
		}
	}
}
// } Driver Code Ends


//User function Template for Java

class Solution{
	void toBinary(int N) {
		//Write your code here
		String ans  = "";
		while(N!=0){
		    int r  = N % 2;
		    ans += r;
		    N /= 2;
		}
		StringBuilder s = new StringBuilder(ans);
		System.out.print(s.reverse());
		
	}
}
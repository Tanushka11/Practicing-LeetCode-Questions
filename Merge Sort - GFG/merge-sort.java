//{ Driver Code Starts
import java.util.*;

class Merge_Sort
{
    //method to print the elements of the array
	static void printArray(int arr[])
    {
        StringBuffer sb=new StringBuffer("");
        int n = arr.length;
        for (int i=0; i<n; ++i)
            sb.append(arr[i]+" ");
        System.out.println(sb.toString());
    }

    

	public static void main(String args[])
	{
	    //taking input using Scanner class
		Scanner sc = new Scanner(System.in);
		
		//taking testcases
		int T = sc.nextInt();
		while(T>0)
		{
		    //taking elements count
			int n = sc.nextInt();
			
			//creating an object of class Merge_Sort
			Merge_Sort ms = new Merge_Sort();
			
			//creating an array of size n
			int arr[] = new int[n];
			
			//adding elements to the array
			for(int i=0;i<n;i++)
				arr[i] = sc.nextInt();

            
			Solution g = new Solution();
			
			//calling the method mergeSort
			g.mergeSort(arr,0,arr.length-1);

            //calling the method printArray
			ms.printArray(arr);
		T--;
		}
	}
}



// } Driver Code Ends


class Solution
{
    void merge(int arr[], int low, int mid, int high)
    {
         // Your code here
         int left = low;
         int right = mid+1;
         int[] temp = new int[high - low  + 1];
         for(int k = 0; k<temp.length; k++){
             while(left<=mid && right<=high){
                 if(arr[left] <= arr[right]){
                     temp[k] = arr[left];
                     k++;
                     left++;
                 }
                 else{
                     temp[k] = arr[right];
                     k++;
                     right++;
                 }
             }
             while(left<=mid){
                 temp[k] = arr[left];
                 left++;
                 k++;
             }
             while(right<=high){
                 temp[k] = arr[right];
                 right++;
                 k++;
             }
         }
         for(int i = low ; i<=high; i++){
             arr[i] = temp[i-low];
         }
        
    }
    void mergeSort(int arr[], int low, int high)
    {
        //code here
        if(low>=high){
            return;
        }
        int mid = (low + high)/2;
        mergeSort(arr,low,mid);
         mergeSort(arr,mid+1,high);
         merge(arr,low,mid,high);
        
    }
}

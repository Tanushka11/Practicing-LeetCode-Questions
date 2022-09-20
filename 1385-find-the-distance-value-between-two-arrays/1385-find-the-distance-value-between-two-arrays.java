class Solution {
    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        int count =0;
        int itr = 0;
        while(itr < arr1.length){
            if(isValid(itr,arr1,arr2,d)){
                count++;
                itr++;
            }
            else{
               itr++; 
            }
        }
        return count;
    }
    boolean isValid(int i , int[] arr1, int[] arr2, int d){
        int j=0;
        
        while(j<arr2.length){
           if(Math.abs(arr1[i] - arr2[j]) > d){
                  j++;
           }
            else{
                return false;
            }
        }
        return true;
    }
}
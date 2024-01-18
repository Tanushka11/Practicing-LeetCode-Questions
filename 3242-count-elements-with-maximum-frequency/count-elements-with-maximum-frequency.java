class Solution {
    public int maxFrequencyElements(int[] nums) {
        int[] arr = new int[101];
        for(int i = 0; i<nums.length; i++){
            arr[nums[i]] += 1;
        }
        int max = 0;
        for(int i = 0; i<arr.length; i++){
           max =  Math.max(max,arr[i]);
        }
        int count = 0; 
        for(int i = 0; i<arr.length; i++){
            if(arr[i] == max){
                count += arr[i];
            }
        }
        return count;
    }
}
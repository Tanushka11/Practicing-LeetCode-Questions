class Solution {
    public int[] sortArrayByParity(int[] nums) {
        if(nums.length < 2){
            return nums;
        }
        Arrays.sort(nums);
        int i=0;
        int j= nums.length -1;
        while(i<j){
            if(nums[i] % 2 != 0 && nums[j] % 2 == 0){
              swap(nums,i,j);
                i++;
                j--;
            }
            if(nums[i] % 2 == 0){
                i++;
            }
            if(nums[j] %2 != 0){
                j--;
            }
        }
        return nums;
    }
    void swap(int[] nums, int x,int y){
        int temp = nums[x];
        nums[x] = nums[y];
        nums[y] = temp;
    } 
}
class Solution {
    public int findDuplicate(int[] nums) {
        newnums(nums);
        int ans=1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=i+1){
                ans=nums[i];
            }
        }
        return ans;
    }
    static void newnums(int[] nums){
        int i=0;
        while(i<nums.length){
            int correctindex= nums[i]-1;
            if(nums[i]!=nums[correctindex]){
                swap(nums,i,correctindex);
            }
            else{
                i++;
            }
        }
    }
    static void swap(int[] nums,int first,int second){
        int temp=nums[first];
                nums[first]=nums[second];
        nums[second]=temp;
        
    }
}
class Solution {
    public List<Integer> findLonely(int[] nums) {
        ArrayList <Integer> ans = new ArrayList<>();
        if(nums.length == 1){
            ans.add(nums[0]);
            return ans;
        }
        Arrays.sort(nums);
        for(int i =0; i<nums.length; i++){
            if(i == 0 && nums[i+1] != nums[i] && nums[i+1] != nums[i] + 1  ){
                ans.add(nums[i]);
            }
            else if(i == nums.length-1 && nums[i-1] != nums[i] && nums[i-1] != nums[i] - 1  ){
                ans.add(nums[i]);
            }
            else if(i != 0 && i != nums.length-1 && nums[i] != nums[i-1] && nums[i] != nums[i+1] && nums[i] - 1 != nums[i-1] && nums[i] + 1 != nums[i+1]){
                 ans.add(nums[i]);
            }
               
        }
        return ans;
    } 
}
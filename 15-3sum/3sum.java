class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
       int n = nums.length - 1;
        Arrays.sort(nums);
        for(int i = 0; i<nums.length; i++){
            if(i>0 && nums[i] == nums[i-1]){
                continue;
            }else{
                int j = i+1;
                int k = n;
                while(j < k){
                    int sum = nums[i] + nums[j] + nums[k];
                    if(sum < 0){
                        j++;
                    }else if (sum > 0){
                        k--;
                    }else{
                        List<Integer> threeNum = Arrays.asList(nums[i], nums[j], nums[k]);
                        ans.add(threeNum);
                        j++;
                        k--;
                        while(j<k && nums[j] == nums[j-1]) j++;
                        while(j<k && nums[k] == nums[k+1]) k--;
                    }
                }
            }
        }
        return ans;
    }
}
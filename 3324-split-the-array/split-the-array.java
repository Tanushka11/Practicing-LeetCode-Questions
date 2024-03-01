class Solution {
    public boolean isPossibleToSplit(int[] nums) {
        Arrays.sort(nums);
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = 0; i<nums.length; i++){
            int v = map.getOrDefault(nums[i] , 0);
            map.put(nums[i] , v+1);
        }
        int one = 0;
        int two = 0;
        int prev = 0;
        for(int i = 0; i<nums.length; i++){
            if(nums[i] != prev && map.get(nums[i]) >= 2){
                one +=1;
                two +=1;
                prev = nums[i];
            }
        }
        for(int i = 0; i<nums.length; i++){
            if(nums[i] != prev && map.get(nums[i]) == 1 && one<nums.length/2){
                one += 1;
                nums[i] = 0;
                 prev = nums[i];
            }
        }
        for(int i = 0; i<nums.length; i++){
            if(nums[i] != prev && nums[i] != 0 && map.get(nums[i]) == 1){
                two += 1;
                 prev = nums[i];
            }
        }
        
        return (one == nums.length/2 && two == nums.length/2);
        
    }
}
class Solution {
    public int maxFrequencyElements(int[] nums) {
        
        HashMap<Integer, Integer> map = new HashMap<>();
        int max = 0;
        for(int i = 0; i<nums.length; i++){
            int v = map.getOrDefault(nums[i],0);
            map.put(nums[i] , v + 1);
            if(map.get(nums[i]) > max){
                max = map.get(nums[i]);
            }
        }
        int count = 0;
        for(int i : map.keySet()){
            if(map.get(i) >= max){
                count += map.get(i);
            }
        }
        return count;
    }
}
class Solution {
    public int firstMissingPositive(int[] nums) {
        // bruteforce  O(nlogn + O(n))
        // Arrays.sort(nums);
        // int smallest = 1;
        // for(int i = 0; i<nums.length; i++){
        //     if(nums[i] == smallest){
        //         smallest++;
        //     }
            
        // }
        // return smallest;

        // with hashmap O(n) + O(n)

        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i= 0; i<nums.length; i++){
            int v = map.getOrDefault(nums[i],0);
            map.put(nums[i] , v+1);
        }
        for(int i =1; i<=nums.length; i++){
            if(!map.containsKey(i)){
                return i;
            }
        }
        return nums.length+1;
    } 
}
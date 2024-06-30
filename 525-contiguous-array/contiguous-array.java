class Solution {
    public int findMaxLength(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0 , -1);

        int ans = 0;
        int sum = 0;

        for(int i = 0; i < nums.length; i++){
            if(nums[i] == 1){
                sum += 1;
            }else{
                sum += -1;
            }
            if(map.containsKey(sum)){
                int ind = map.get(sum);
                int potentialMax = i - ind;
                if(potentialMax > ans){
                    ans = potentialMax;
                }
            }else{
                map.put(sum,i);
            }
        }
        return ans;
    }
}
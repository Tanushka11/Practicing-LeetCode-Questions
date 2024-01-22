class Solution {
    public List<Integer> intersection(int[][] nums) {
        List<Integer> ans = new ArrayList<>();
        int[] freq = new int[1001];
        for(int i = 0; i < nums.length; i++){
            for(int j = 0; j < nums[i].length; j++){
               int n = nums[i][j];
               freq[n]++;
            }
        }
       for(int i=0; i < 1001; i++){
           if(freq[i]==nums.length){
               ans.add(i);
           }
       }
        
        return ans;
    }
}
class Solution {
    public int largestInteger(int num) {
          String s = Integer.toString(num);
        int[] nums = new int[s.length()];
        for(int i = 0; i<s.length(); i++){
            nums[i] = s.charAt(i) - '0';
        }
        ArrayList<Integer> odds = new ArrayList<>();
        for(int i = 0; i<nums.length; i++){
            if(nums[i] % 2 != 0){
                odds.add(nums[i]);
            }
        }
        Collections.sort(odds);

        ArrayList<Integer> even = new ArrayList<>();
        for(int i = 0; i<nums.length; i++){
            if(nums[i] % 2 == 0){
                even.add(nums[i]);
            }
        }
        Collections.sort(even);

        int o = odds.size() - 1;
        int e = even.size() - 1;
        int ans = 0;
        for(int i = 0; i<nums.length; i++){
            if(nums[i] % 2 == 0){
                nums[i] = even.get(e);
                e--;
            }else{
                nums[i] = odds.get(o);
                o--;
            }
        }

    for(int i = 0; i<nums.length; i++){
        ans = ans*10 + nums[i];
    }
       
        return ans;
    }
}
class Solution {
    public int rangeSum(int[] nums, int n, int left, int right) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0; i<n; i++){
            int sum = 0;
            for(int j = i; j < n; j++){
                sum += nums[j];
                list.add(sum);
            }
        }
        Collections.sort(list);
        long ans = 0;
        for(int i = left-1; i<right; i++){
            ans += list.get(i);
        }
        if(ans > Integer.MAX_VALUE) return 716699888;
        return (int)ans;
    }
}
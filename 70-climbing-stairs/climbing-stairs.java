class Solution {
    HashMap<Integer,Integer> cache = new HashMap<>();
    public int climbStairs(int n) {
        if(n == 1 || n == 0){
            return 1;
        }
       if(cache.get(n) != null) return cache.get(n);
       cache.put(n, climbStairs(n-1) + climbStairs(n-2));
       
        return climbStairs(n-1) + climbStairs(n-2);
    }
}
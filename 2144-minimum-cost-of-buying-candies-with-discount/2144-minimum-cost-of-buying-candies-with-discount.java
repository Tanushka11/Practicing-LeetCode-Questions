class Solution {
    public int minimumCost(int[] cost) {
        Arrays.sort(cost);
        int count = 0;
        int MinimumCost = 0;
        for(int i =cost.length-1; i>=0; i--){
            if(count!=2){
                MinimumCost += cost[i];
                count ++;
            }else{
                count = 0;
            }

        }
        return MinimumCost;
    }
}
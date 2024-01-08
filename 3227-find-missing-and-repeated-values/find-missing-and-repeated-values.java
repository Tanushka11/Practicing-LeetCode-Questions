class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int[] ans = new int[2];
        HashSet<Integer> set = new HashSet<>();
        for(int i = 0; i<grid.length; i++){
            for(int j = 0; j<grid[0].length; j++){
                if(set.contains(grid[i][j])){
                    ans[0] = grid[i][j];
                }
                set.add(grid[i][j]);
            }
        }
        int n = grid.length * grid[0].length;
        for(int i = 1; i<=n; i++){
            if(!set.contains(i)){
                ans[1] = i;
                break;
            }
        }
        return ans;
    }
}
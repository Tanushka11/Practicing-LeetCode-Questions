class Solution {
    public List<Integer> zigzagTraversal(int[][] grid) {
        List<Integer> ans = new ArrayList<>();
        
        for(int i = 0; i<grid.length; i++){
            if((i+1) % 2 != 0){
                for(int j = 0; j<grid[0].length; j+=2){
                    ans.add(grid[i][j]);
                }  
            }else{
                int j;
                if(grid[0].length % 2 == 0) {
                    j = grid[0].length-1;
                }else j = grid[0].length-2;
                for(; j>=1; j-=2){
                    ans.add(grid[i][j]);
                }  
            }
            
        }
    
        return ans;
    }
}
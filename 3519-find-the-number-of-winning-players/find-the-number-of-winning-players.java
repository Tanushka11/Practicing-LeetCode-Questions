class Solution {
    public int winningPlayerCount(int n, int[][] pick) {
        // store how many colors got picked by a player and also keep a 
        //track of how many times that particular clour got picked
        int[][] colors = new int[n][11];
        for(int[] p : pick){
            int player = p[0];
            int color = p[1];
            colors[player][color]++;
        }
        int c = 0;
        for(int i = 0; i < n; i++){
            for(int j = 0; j<11; j++){
                if(colors[i][j] > i) {
                    c++;
                    break;
                }
            }
        }
        return c;
    }
}
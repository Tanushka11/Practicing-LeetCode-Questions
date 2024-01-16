class Solution {
    public List<List<Integer>> findWinners(int[][] matches) {
        
       int[] countWinAndLoss = new int[1000001];

       for(int i = 0; i<matches.length; i++){
           int w = matches[i][0];
           int l = matches[i][1];
           if(countWinAndLoss[w] == 0){
               countWinAndLoss[w] = -1;
           }
           if(countWinAndLoss[l] == -1){
               countWinAndLoss[l] = 1;
           }else{
               countWinAndLoss[l]++;
           }
       }
       ArrayList<Integer> winners = new ArrayList<>();
       ArrayList<Integer> winnersWithALoss = new ArrayList<>();

       for(int i = 0; i < countWinAndLoss.length; i++){
           if(countWinAndLoss[i] == -1){
               winners.add(i);
           }else if(countWinAndLoss[i] == 1){
               winnersWithALoss.add(i);
           }
       }
       List<List<Integer>> ans = new ArrayList<>();
     ans.add(winners);
     ans.add(winnersWithALoss);
    return ans; 
    }
}
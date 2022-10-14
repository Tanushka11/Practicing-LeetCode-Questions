class Solution {
    public int hardestWorker(int n, int[][] logs) {
       
        int Time = logs[0][1];
        int Id = logs[0][0];
       
        for(int i = 1 ; i<logs.length; i++)
        {
            int currTime = logs[i][1] - logs[i-1][1];
            if(currTime>Time || (currTime == Time && logs[i][0] < Id) ){
                Time = currTime;
                Id  = logs[i][0];
            }
        }
        return Id;
    }
}
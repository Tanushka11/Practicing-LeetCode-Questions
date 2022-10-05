class Solution {
    public int nearestValidPoint(int x, int y, int[][] points) {
        int index = -1;
        if(points.length <2){
            if(points[0][0] == x &&  points[0][1] == y){
                return 0;
            }
            return -1;
        }
        int validDist  = Integer.MAX_VALUE;
       
        for(int i = 0 ; i<points.length; i++)
        {
               if(points[i][0] == x || points[i][1] == y)
               {
                  int x1 = points[i][0];
                  int y1 = points[i][1];
                  int md =  Math.abs(x-x1) + Math.abs(y-y1);
                   if(md < validDist){
                      validDist = md;
                       index = i;
                   }
               
           }
        }
        return index;
    }
}
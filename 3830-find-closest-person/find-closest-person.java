class Solution {
    public int findClosest(int x, int y, int z) {
        int xdist = Math.abs(z - x); 
        int ydist = Math.abs(z - y); 
        if(xdist < ydist){
            return 1;
        }else if(xdist > ydist){
             return 2;
        }
        return 0;
    }
}
class Solution {
    public int maximumUnits(int[][] boxTypes, int truckSize) {
        Arrays.sort(boxTypes, (a,b) -> -Integer.compare(a[1],b[1]));
        int MaxUnits=0;
       
            for(int box[] : boxTypes){
                if(box[0]<truckSize){
                    MaxUnits += box[0] * box[1];
                    truckSize -=box[0];
                }else{
                    return MaxUnits+= truckSize * box[1];
                }
                
            }
        
        return MaxUnits;
    }
}
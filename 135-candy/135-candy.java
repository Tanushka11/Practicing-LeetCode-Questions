class Solution {
    public int candy(int[] ratings) {
        int TC=0;
        int [] distribute= new int[ratings.length];
        Arrays.fill(distribute,1);
        for(int i=0;i<ratings.length-1;i++){
            if(ratings[i+1]>ratings[i]){
                if(distribute[i+1]<=distribute[i]){
                  distribute[i+1]= distribute[i] + 1;
                }
                }
        }
         for(int i=ratings.length-1; i>0 ;i--){
            if(ratings[i-1]>ratings[i]){
                if(distribute[i-1]<=distribute[i]){
                  distribute[i-1]= distribute[i] + 1;
                }
                }
        }
       for(int i=0;i<distribute.length;i++){
           TC += distribute[i];
       }
        return TC;
        
    }
}
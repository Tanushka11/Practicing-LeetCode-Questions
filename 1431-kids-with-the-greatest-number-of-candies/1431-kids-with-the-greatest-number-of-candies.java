class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int sum=0;
        int max=candies[0];
          for(int i=0;i<candies.length;i++){
              max=Math.max(max,candies[i]);
          }
           
        ArrayList<Boolean> list=new ArrayList<>();
            for(int i=0;i<candies.length;i++){
             
             sum=candies[i]+ extraCandies;
           if(sum>=max){
              list.add(true);
           }
           else{
               list.add(false);
           }
           
        }
        return list;
    }
}
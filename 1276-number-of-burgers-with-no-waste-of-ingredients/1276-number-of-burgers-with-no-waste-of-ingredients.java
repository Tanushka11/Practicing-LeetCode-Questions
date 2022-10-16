class Solution {
    public List<Integer> numOfBurgers(int ts, int cs) {
       List<Integer> ans = new ArrayList<>();
        
        if(ts % 2 != 0 || cs*2 > ts  || cs*4 < ts){
            return ans;
        }
        else{
            int jB = (ts-2*cs)/2;
            int sB = cs - jB;
            ans.add(jB);
            ans.add(sB);
        }
        
        return ans;
    }
}
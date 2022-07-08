class Solution {
    public int percentageLetter(String s, char letter) {
        if(s.length()==0){
            return 0;
        }
        int count=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==letter){
                count++;
            }
        }
        int ans=0;
         
        ans=(count*100)/s.length();
        return ans;
    }
}
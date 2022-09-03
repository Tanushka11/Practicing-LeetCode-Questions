class Solution {
    public boolean isPalindrome(int x) {
        if(x<0 || (x!=0 && x%10==0)){
           return false;
        }
        else if(x<=9){
            return true;
        }
       int ans=0;
        while(x>ans){
            ans= ans *10 + (x%10);
            x=x/10;
        }
        
        return ((x==ans)|| x==ans/10);
    }
}

class Solution {
    public void reverseString(char[] s) {
//        with recursion
        int i=0;
        int j=s.length-1;
        reverse(s,i,j);
        
    }
    char[] reverse(char[] s,int i, int j){
        
        if(i>j || i<0 || j==s.length ){
            return s;
        }
       char temp=s[i];
        s[i]=s[j];
        s[j]=temp;
        i++;
        j--;
        return reverse(s,i,j);
        
    }
}
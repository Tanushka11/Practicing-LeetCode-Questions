class Solution {
    public void reverseString(char[] s) {
//         with recursion
        int start=0;
        int end=s.length-1;
        reverse(s,start,end);
    }
    char[] reverse(char[] s,int start, int end){
        if(start>=end|| s.length==0)
        {
            return s;
            }
        char temp=s[start];
        s[start]=s[end];
        s[end]=temp;
        start++;
        end--;
        return reverse(s,start,end);
    }
}
class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
     int l = 0;
     int r = 0;
     while(l < s.length){
       if(r < g.length && g[r] <= s[l]){
        r++;
       }
       l++;
     }
        return r;
    }
}
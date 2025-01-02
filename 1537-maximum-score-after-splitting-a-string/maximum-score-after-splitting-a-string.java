class Solution {
    public int maxScore(String s) {
        if (!s.contains("0") || !s.contains("1")) {
    return s.length() - 1;
}

        int max = Integer.MIN_VALUE;
        int j = s.length();
        for(int i = 0; i < s.length() - 1; i++){
            String left = s.substring(0,i+1);
            String right = s.substring(i+1, j);
            int c = count(left, right);
            System.out.print(left + " " + right + " " + c + " ");
            if( c > max){
                max = c;
            }
        }
        return max;
    }
    int count (String left, String right){
        int ans = 0;
        int l = left.length();
        int r = right.length();
        for(int i = 0; i<l; i++){
            if(left.charAt(i) == '0'){
                ans++;
            }
        }
        for(int i = 0; i<r; i++){
            if(right.charAt(i) == '1'){
                ans++;
            }
        }
        return ans;
    }
}
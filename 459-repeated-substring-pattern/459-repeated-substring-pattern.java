class Solution {
    public boolean repeatedSubstringPattern(String s) {
        int l=s.length();
        for(int i=l/2;i>=1;i--){
            if(l % i ==0){
                int m=l/i;
                String ss=s.substring(0,i);
                StringBuilder sb= new StringBuilder();
                for(int j=0;j<m;j++){
                    sb.append(ss);
                }
                 if(sb.toString().equals(s)){
                        return true;
                    }
            }
            
        }
        return false;
    }
}

class Solution {
    public String longestCommonPrefix(String[] strs) {
        int i = 0;
        while(true){
            if(i < strs[0].length()){
                char ch = strs[0].charAt(i);
                boolean b = true;
                for(int j = 1; j < strs.length; j++){
                    if(i < strs[j].length() && strs[j].charAt(i) == ch){
                        continue;
                    }else{
                        b = false;
                        break;
                    }
                }
                if(b){
                    i++;
                }else{
                    break;
                }
            }else{
                break;
            }
        }
        return strs[0].substring(0,i);
    }
}
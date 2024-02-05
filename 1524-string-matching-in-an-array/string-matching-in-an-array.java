class Solution {
    public List<String> stringMatching(String[] words) {
        List<String> list = new ArrayList<>();
        for(int i = 0; i < words.length; i++){
            if(findSubstring(words[i], i, words)){
                list.add(words[i]);
            }
        }
        return list;
    }
    Boolean findSubstring(String s, int k , String[] words){
        for(int i = 0 ; i<words.length  ; i++ ){
            if(  i!=k && isSubstring(s, words[i])){
                return true;
            }
        }
        return false;
    }
    Boolean isSubstring(String s1 ,  String s2){
        
        for(int i = 0; i<s2.length(); i++){
            String str = "";
            
            int k = i+1;
            while(k <= s2.length()){
                str = s2.substring(i,k);
                if(str.equals(s1)){
                    return true;
                }
                k++;
            }
        }
        return false;   
    }
}
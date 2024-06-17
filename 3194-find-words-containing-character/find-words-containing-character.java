class Solution {
    public List<Integer> findWordsContaining(String[] words, char x) {
       ArrayList<Integer> ans = new ArrayList<>();
       for(int i = 0; i<words.length; i++){
        int len = words[i].length();
        for(int j = 0; j < len; j++){
            if(words[i].charAt(j) == x){
                if(!ans.contains(i)) ans.add(i);
            }
        }
       }
       return ans;
    }
}
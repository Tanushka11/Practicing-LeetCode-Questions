class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        int count  = 0;
        for(int i = 0; i < words.length; i++){
            if(check(allowed, words,i)){
                count++;
            }
        }
        return count;
    }
    boolean check(String allowed, String[] words, int s){
         HashSet<Character> set = new HashSet<>();
        for(int i = 0; i < allowed.length(); i++){
            set.add(allowed.charAt(i));
        }
        for(int i = 0; i < words[s].length(); i++){
            if(!set.contains(words[s].charAt(i))){
                return false;
            }
        }
        return true;
    }
}
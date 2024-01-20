class Solution {
    public int similarPairs(String[] words) {
        int count = 0;
        for(int i = 0; i < words.length - 1; i++){
            for(int j = i+1; j < words.length; j++){
                if(foundPair( words, i, j)){
                    count++;
                }
            }
        }
        return count;
    }
    boolean foundPair(String[] words, int i , int j){
        HashSet<Character> set1 = new HashSet<>();
        HashSet<Character> set2 = new HashSet<>();
        for(int l = 0; l<words[i].length(); l++){
            set1.add(words[i].charAt(l));
        }

        for(int k = 0; k< words[j].length(); k++){
            set2.add(words[j].charAt(k));
        }

        if(!set1.equals(set2)){
            return false;
        }
        return true;
    }
}
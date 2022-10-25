class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        StringBuilder one = new StringBuilder();
         StringBuilder two = new StringBuilder();
        for(String s : word1){
            one.append(s);
        }
        for(String s : word2){
            two.append(s);
        }
        return one.toString().equals(two.toString());
    }
}
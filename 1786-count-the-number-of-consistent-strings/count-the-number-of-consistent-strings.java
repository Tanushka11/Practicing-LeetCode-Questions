class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        int count = words.length;
        int[] arr = new int[26];
        for(char c : allowed.toCharArray()){
            arr[c-'a']++;
        }
        for(int i = 0; i<words.length; i++){
            for(char c : words[i].toCharArray()){
                if(arr[c-'a'] <= 0){
                    count--;
                    break;
                }
            }
        }
        return count;
    }
}
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>();

        for(String s : strs){
            int[] freq = new int[26];
            for(int i = 0; i < freq.length; i++){
                freq[i] = 1;
            }
            for(char ch : s.toCharArray()){
                freq[ch-'a']++;
            }
            String freqPattern = "";
            for(int charfreq : freq){
                freqPattern += charfreq + "";
            }
            if(!map.containsKey(freqPattern)){
                map.put(freqPattern, new ArrayList<>());
            }
                map.get(freqPattern).add(s);
        }
        return new ArrayList<>(map.values());
    }
}
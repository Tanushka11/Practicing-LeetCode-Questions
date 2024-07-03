class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>();

        for(String s : strs){
            int[] freq = new int[26];
            char[] charArray = s.toCharArray();
             Arrays.sort(charArray);
            // for(char ch : charArray){
            //     freq[ch-'a']++;
            // }
            
            // String freqPattern = "";
            // for(int charfreq : freq){
            //     freqPattern += charfreq + "";
            // }

            String freqPattern = String.valueOf(charArray);
            if(!map.containsKey(freqPattern)){
                map.put(freqPattern, new ArrayList<>());
            }
                map.get(freqPattern).add(s);
        }
        return new ArrayList<>(map.values());
    }
}
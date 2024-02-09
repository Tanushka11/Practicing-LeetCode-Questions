class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {
        HashMap<String, Integer> map = new HashMap<>();
        String[] words1 = s1.split(" ");
        String[] words2 = s2.split(" ");
        for(int i = 0; i<words1.length; i++){
            map.put(words1[i], map.getOrDefault(words1[i] , 0) + 1);
        }
        for(int i = 0; i<words2.length; i++){
            map.put(words2[i], map.getOrDefault(words2[i] , 0) + 1);
        }
        List<String> ans = new ArrayList<>();
        for(String s : map.keySet()){
            if(map.get(s) == 1){
                ans.add(s);
            }
        }
        return ans.toArray(new String[ans.size()]);
    }
}
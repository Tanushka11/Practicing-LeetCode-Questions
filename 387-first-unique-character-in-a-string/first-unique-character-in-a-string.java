class Solution {
    public int firstUniqChar(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        for(int i = 0; i<s.length(); i++){
            int v = map.getOrDefault(s.charAt(i) , 0);
            map.put(s.charAt(i) , v + 1);
        }
        for(int i = 0; i<s.length(); i++){
            if(map.get(s.charAt(i)) == 1){
                return i;
            }
        }
            return -1;
    }
}
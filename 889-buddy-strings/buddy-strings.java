class Solution {
    public boolean buddyStrings(String s, String goal) {
        int len1 = s.length();
        int len2 = goal.length();

        if(len1 != len2 ){
            return false;
        }
       if (s.equals(goal)) {
            Set<Character> temp = new HashSet<>();
            for (char c : s.toCharArray()) {
                temp.add(c);
            }
            return temp.size() < goal.length(); 
        }
        ArrayList<Integer> l = new ArrayList<>();
        for(int i = 0; i<len1; i++){
            if(s.charAt(i) != goal.charAt(i)){
                l.add(i);
            }
            if(l.size() > 2){
                return false;
            }
        }
        if(l.size() == 2){
            char[] arr = s.toCharArray();
            char temp = arr[l.get(0)];
            arr[l.get(0)] = arr[l.get(1)];
            arr[l.get(1)] = temp;
            String ans = new String(arr);
            if(ans.equals(goal)){
                return true;
            }
        }
        return false;
    }
}
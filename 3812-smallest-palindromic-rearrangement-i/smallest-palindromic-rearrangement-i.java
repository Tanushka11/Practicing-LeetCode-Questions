class Solution {
    public String smallestPalindrome(String s) {
        int n = s.length();
        if(n == 1) return s;
        char[] firstHalf = new char[n/2];
        for(int i = 0; i<firstHalf.length; i++){
            firstHalf[i] = s.charAt(i);
        }
        Arrays.sort(firstHalf);
       ArrayList<Character> secondHalf = new ArrayList<>();
       
       for(int i = firstHalf.length - 1; i>=0; i--){
        secondHalf.add(firstHalf[i]);
       }
        StringBuilder merged = new StringBuilder();
        for (char c : firstHalf) {
            merged.append(c);
        }
        if(n % 2 == 1) merged.append(s.charAt(n/2));

        for (char c : secondHalf) {
            merged.append(c);
        }
        return merged.toString();
    }
}
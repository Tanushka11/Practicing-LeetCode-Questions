class Solution {
    public String sortVowels(String s) {
        ArrayList<Integer> indexOfVowels = new ArrayList<>(); 
        ArrayList<Character> vowels = new ArrayList<>(); 
        String v = "AEIOUaeiou";

        for(int i = 0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(v.contains(String.valueOf(ch))){
                vowels.add(ch);
               indexOfVowels.add(i);
            }
        }
        Collections.sort(vowels);
        char[] ans = s.toCharArray();
        for(int i = 0; i < indexOfVowels.size() ; i++){
            ans[indexOfVowels.get(i)] = vowels.get(i);
        }
        return new String(ans);
    }
}
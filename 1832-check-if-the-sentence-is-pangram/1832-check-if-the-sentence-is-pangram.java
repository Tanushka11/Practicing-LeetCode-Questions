class Solution {
    public boolean checkIfPangram(String sentence) {
       Set<Character> hashSet= new HashSet<>();
        for(int i=0;i<sentence.length();i++){
            hashSet.add(sentence.charAt(i));
            
        }
        return hashSet.size()==26;
    }
}
 
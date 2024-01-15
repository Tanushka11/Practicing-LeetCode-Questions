class Solution {
    public boolean areAlmostEqual(String s1, String s2) {
        int[] arr1 = new int[26];
        int[] arr2 = new int[26];
        int c = 0;
        for(int i = 0; i<s1.length(); i++){
            char ch1 = s1.charAt(i);
            char ch2 = s2.charAt(i);
            if(ch1 != ch2){
                c++;
                if(c > 2){
                    return false;
                }
            }
            arr1[ch1 - 'a']++;
            arr2[ch2 - 'a']++;
        }
        return Arrays.equals(arr1,arr2);
    }
}
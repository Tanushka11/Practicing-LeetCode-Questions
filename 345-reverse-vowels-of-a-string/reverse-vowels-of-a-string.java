class Solution {
    public String reverseVowels(String s) {
        char[] arr = s.toCharArray();
        int i = 0;
        int j = s.length() - 1;
        while(i < j){
            if(checkVowel(s,i) && checkVowel(s,j)){
                char temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            }else if(!checkVowel(s,i)){
                i++;
            }else if(!checkVowel(s,j)){
                j--;
            }
        }
        String ans = new String(arr);
        return ans;
    }
    boolean checkVowel(String s, int i){
        if((s.charAt(i) == 'A' || s.charAt(i) == 'E' || s.charAt(i) == 'I' || s.charAt(i) == 'O' || s.charAt(i) == 'U')){
            return true;
        }else if(s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o' || s.charAt(i) == 'u'){
            return true;
        }
        return false;
    }
}
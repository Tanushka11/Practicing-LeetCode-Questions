class Solution {
    public String sortVowels(String s) {
        String v = "AEIOUaeiou";
        String str = "";
        String sorted = "";
        for(int i = 0; i<s.length(); i++){
            char ch  = s.charAt(i);
            if(v.contains(String.valueOf(ch))){
                str += ch;
            }
        }
        char[] arr = str.toCharArray();
        Arrays.sort(arr);
        String ans  = new String(arr);
        int k = 0;
        int l = 0;
        while(l < s.length()){
            char ch1 = s.charAt(l);
            if(!v.contains(String.valueOf(ch1))){
                sorted += ch1;
            }else{
                if(k < ans.length()){
                char ch2 = ans.charAt(k);
                sorted += ch2;
                k++;
                }
            }
            l++;
        }
        return sorted;
    }
}
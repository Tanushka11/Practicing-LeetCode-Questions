class Solution {
    public ArrayList<String> letterCombinations(String digits) {
        
         if(digits.length()==0){
            ArrayList<String> emptyArr=new ArrayList<>();
           
            return emptyArr;
          
         }
            ArrayList<String> ans=helper(digits);
           return ans;
    }
        ArrayList<String> helper(String digits){
        String[] codes={"", "1", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        if(digits.length()==0){
            ArrayList<String> emptyArr=new ArrayList<>();
             emptyArr.add("");
            return emptyArr;
        }
        char ch=digits.charAt(0);
        String sub = digits.substring(1);
        ArrayList<String> recSub= helper(sub);
        
        ArrayList<String> Result=new ArrayList<>();
        String required=codes[ch-'0'];
        for(int i=0;i<required.length();i++){
          char charRequired=required.charAt(i);
            for(String letters : recSub){
             Result.add(charRequired + letters);
            }
        }
        return Result;
            
        }
        
        
    }
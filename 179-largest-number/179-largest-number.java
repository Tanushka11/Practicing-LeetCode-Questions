class Solution {
    public String largestNumber(int[] nums) {
        if(nums == null || nums.length==0  ){
            return "";
        }
        String[] ans = new String[nums.length];
        for(int i=0 ; i<nums.length ; i++){
            ans[i] = nums[i] + "";
        }
       
         
        Comparator<String> comp = new Comparator<String>(){
            @Override 
            public int compare(String a, String b){
                String n1 = a + b;
                String n2 = b + a;
                return n2.compareTo(n1);
            }
        };
       Arrays.sort(ans, comp);
        StringBuilder sb = new StringBuilder("");
        for(int i=0 ; i<ans.length ; i++){
            sb.append(ans[i]);
        }
        if(sb.charAt(0) == '0'){
            return "0";
        }
        return sb.toString();
    }
}
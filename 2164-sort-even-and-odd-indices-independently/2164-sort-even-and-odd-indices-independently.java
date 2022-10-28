class Solution {
    public int[] sortEvenOdd(int[] nums) {
      ArrayList<Integer> evenI = new ArrayList<>(); 
         ArrayList<Integer> oddI = new ArrayList<>(); 
        for(int i = 0;i<nums.length;i++){
            if(i%2 == 0) {
                evenI.add(nums[i]);
            }
            else{
                oddI.add(nums[i]);
            }
        }
        Collections.sort(evenI);
         Collections.sort(oddI);
        Collections.reverse(oddI);
        
        int[] ans = new int[nums.length];
        int l = 0;
        int  m = 0;
        for(int k = 0; k<nums.length; k++){
            if(k%2 == 0){
                ans[k] = evenI.get(l);
                l++;
            }
            else{
                ans[k] = oddI.get(m);
               m++;
            }
        }
       
        
         
        return ans;
    }
}
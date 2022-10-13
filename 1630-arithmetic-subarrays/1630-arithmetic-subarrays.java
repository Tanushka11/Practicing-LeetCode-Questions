class Solution {
    public List<Boolean> checkArithmeticSubarrays(int[] nums, int[] l, int[] r) {
        
        List<Boolean> ans = new ArrayList<>();
        int m = l.length;
        for(int i=0; i<m; i ++){
            ArrayList<Integer> arr = new ArrayList<>();
            int start = l[i];
            int end = r[i];
            for(int j = start; j<end +1; j++){
                arr.add(nums[j]);
            }
            ans.add(isArithmatic(arr));
        }
        return ans;
    }
          boolean isArithmatic(ArrayList<Integer> arr){
    Collections.sort(arr);
              int d = arr.get(1) - arr.get(0);
              if(arr.size() < 2){
                  return false;
              }
              for(int i=0 ; i<arr.size()-1; i++){
                  if( arr.get(i+1) - arr.get(i) != d ){
                      return false;
                  }
              }
              return true;
    }
}
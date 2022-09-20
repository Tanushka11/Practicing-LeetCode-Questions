class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        Arrays.sort(arr);
        List<List<Integer>> ans = new ArrayList<>();
        int min = Integer.MAX_VALUE;
        
        for(int i=0; i<arr.length-1; i++){
         if(arr[i+1] - arr[i] < min)   {
             min = arr[i+1] - arr[i];
         }
        }
        for(int i=0; i<arr.length-1; i++){
            if(arr[i+1] - arr[i] == min){
             // ans.add(Arrays.asList(arr[i],arr[i+1]));
                List <Integer> pair = new ArrayList<>(2);
                pair.add(arr[i]);
                pair.add(arr[i+1]);
                ans.add(pair);
            }
        }
        return ans;
    }
}
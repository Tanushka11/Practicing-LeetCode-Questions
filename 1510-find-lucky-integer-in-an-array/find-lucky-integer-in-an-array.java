class Solution {
    public int findLucky(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < arr.length; i++){
            int v = map.getOrDefault(arr[i] , 0);
            map.put(arr[i] , v+1);
        }
        int max = -1;
        for(int i : map.keySet()){
            if(map.get(i) == i){
                max = Math.max(max,i);
            }
        }
        return max;
    }
}
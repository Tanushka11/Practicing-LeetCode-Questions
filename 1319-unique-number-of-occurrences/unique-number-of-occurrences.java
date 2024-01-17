class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i<arr.length; i++){
            int v = map.getOrDefault(arr[i],0);
            map.put(arr[i], v + 1);
        }
        HashSet<Integer> set  = new HashSet<>();
        for(int i : map.keySet()){
           if(set.contains(map.get(i))){
               return false;
           }else{
               set.add(map.get(i));
           }
        }
        return true;
    }
}
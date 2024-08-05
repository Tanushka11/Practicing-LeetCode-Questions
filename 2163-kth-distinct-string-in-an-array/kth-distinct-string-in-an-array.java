class Solution {
    public String kthDistinct(String[] arr, int k) {
        HashMap<String, Integer> map = new HashMap<>();
        for(String str : arr){
            int v = map.getOrDefault(str, 0);
            map.put(str, v+1);   
        }
        int count = 0;
        for(String i : arr){
            if(map.get(i) == 1){
                count++;
                if(count == k) return i;
            }
        }
        return "";
    }
}
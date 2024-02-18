class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        HashMap<Integer, Integer> map = new HashMap<>();
        HashSet<Integer> set = new HashSet<>();
        for(int i : arr1){
            int v = map.getOrDefault(map.get(i),0);
            if(map.containsKey(i)){
                map.put(i,v+1);
            }else{
                map.put(i,1);
            }
        }
        for(int i :  arr2){
            set.add(i);
        }
        ArrayList<Integer> sort = new ArrayList<>();
        for(int i : arr1){
            if(!set.contains(i)){
                sort.add(i);
            }
        }
        Collections.sort(sort);
        int[] ans = new int[arr1.length];
        int k = 0;
        int times = 0;
        for(int i = 0; i<arr2.length; i++){
            times = map.get(arr2[i]);
            while(times > 0){
                ans[k] = arr2[i];
                k++;
                times -= 1;
            }
        }
        for(int j = 0; j<sort.size(); j++){
            ans[k++] = sort.get(j);
        }
        System.out.print(map);
        return ans;
    }
}
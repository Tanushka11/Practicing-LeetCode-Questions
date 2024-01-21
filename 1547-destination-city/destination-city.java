class Solution {
    public String destCity(List<List<String>> paths) {
        HashSet<String> set = new HashSet<>();
        for(int i = 0; i<paths.size(); i++){
            set.add(paths.get(i).get(0));
        }
       for(int j = 0; j<paths.size(); j++){
           String s1 = paths.get(j).get(0);
           String s2 = paths.get(j).get(1);
           if(!set.contains(s1)){
               return s1;
           }else if(!set.contains(s2)){
               return s2;
           }
       }
       return "";
    }
}
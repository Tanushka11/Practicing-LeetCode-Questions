class Solution {
    public String countOfAtoms(String formula) {
        //stack for storing hashmap so that we can pop that hashmap when we find close parenthesis
        Stack<Map<String, Integer>> stack = new Stack<>();

        int n = formula.length();
        stack.push(new HashMap<>());

        int i = 0;

        while(i < n){
            if(formula.charAt(i) == '('){
                stack.push(new HashMap<>());
                i++;
            }else if(formula.charAt(i) == ')'){
                Map<String, Integer> mapPresentTopOfStack = stack.pop();
                i++;
                int start = i;
                while(i<n && Character.isDigit(formula.charAt(i))) i++;
               int multiplier = 1;
               if(start < i){
                multiplier  = Integer.parseInt(formula.substring(start,i));
               }
               // updating the map with multiplier and merging it to the map present at peek of stack

               for(String key : mapPresentTopOfStack.keySet())
               stack.peek().put(key, stack.peek().getOrDefault(key,0) + multiplier * mapPresentTopOfStack.get(key)); 
            }
            else{
                int start = i;
                i++;
                while(i < n && Character.isLowerCase(formula.charAt(i))) i++;
                String str = formula.substring(start,i);
                start = i;
                while(i < n && Character.isDigit(formula.charAt(i))) i++;
                int count  = 1;
                if( i > start){
                    count  = Integer.parseInt(formula.substring(start,i));
                }
                stack.peek().put(str, stack.peek().getOrDefault(str,0) + count);
            }
        }

        Map <String, Integer> ans = stack.pop();
        List<String> sortElems = new ArrayList<>(ans.keySet());
        Collections.sort(sortElems);
        StringBuilder sb = new StringBuilder();
        for(String elem : sortElems){
            sb.append(elem);
            if(ans.get(elem) > 1){
                sb.append(ans.get(elem));
            }
        }
        return sb.toString();
    }
}
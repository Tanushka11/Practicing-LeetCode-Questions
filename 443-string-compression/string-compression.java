class Solution {
    public int compress(char[] chars) {
       int i = 1;
       int count = 1;
       StringBuilder sb = new StringBuilder();
       sb.append(chars[0]);
       while(i < chars.length){
        char curr = chars[i];
        char prev = chars[i-1];
        if(curr == prev) count++;
        else{
            if(count > 1){
                sb.append(count);
                count = 1;
            }
            sb.append(curr);
        }
        i++;
       } 
      if(count > 1) sb.append(count);
     for(int j = 0; j < sb.length(); j++){
        chars[j] = sb.charAt(j);
     }

       return sb.length();
    }
}
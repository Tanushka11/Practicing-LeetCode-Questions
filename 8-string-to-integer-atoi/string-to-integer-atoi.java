class Solution {
   
    public int myAtoi(String s) {
        s = s.trim();
        if (s.isEmpty()) return 0;
        return atoirecur(s, 0, 1, 0);
    }

    public int atoirecur(String s,int i,int sign, long res){
        if(i == s.length()) return (int) (sign*res);

        char c = s.charAt(i);
        if(Character.isDigit(c)){
            res = (res * 10)+(c-'0');

            if(res*sign > Integer.MAX_VALUE) return Integer.MAX_VALUE;
            if(res*sign < Integer.MIN_VALUE) return Integer.MIN_VALUE;

            return atoirecur(s,i+1,sign,res);
        }
        else if(i == 0 && (c=='+' || c=='-')){
            if(c=='+') return atoirecur(s,i+1,sign,res);
            if(c=='-') return atoirecur(s,i+1,sign*-1,res);
        }
        return (int)(sign * res);
    }
    }

class Solution {
    public static int f(String s)
    {
        int sum=0;
        for(int i=0;i<s.length();i++)
        {
            sum+=s.charAt(i)-'0';
        }
        return sum;
    }
    public String digitSum(String s, int k) {
        
        while(s.length()>k)
        {
            String sub="";
            int i=0;
            for( i=0;i<s.length();i+=k)
            {
                if(i+k<=s.length())
                sub+=f(s.substring(i,i+k))+"";
            }
            
              int r=s.length()%k;
              if(r>0)
              sub+=f(s.substring(s.length()-r,s.length()))+"";
            
            

            s=sub;
             
        }
        return s;
    }
}
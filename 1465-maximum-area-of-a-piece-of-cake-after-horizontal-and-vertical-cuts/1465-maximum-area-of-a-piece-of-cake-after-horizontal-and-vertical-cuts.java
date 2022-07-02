class Solution {
    public int maxArea(int h, int w, int[] hc, int[] vc) {
        Arrays.sort(hc);
        Arrays.sort(vc);
       int maxh=Math.max(hc[0],h-hc[hc.length-1]);
        int maxv=Math.max(vc[0],w-vc[vc.length-1]);
        for(int i=1;i<hc.length;i++){
            // if(hc[i]-hc[i-1]>maxh){
            //     maxh=hc[i]-hc[i-1];
            // }
            maxh=Math.max(maxh,hc[i]-hc[i-1]);
        }
            for(int i=1;i<vc.length;i++){
            //  if(vc[i]-vc[i-1]>maxv){
            //     maxv=vc[i]-vc[i-1];
            // }
                maxv=Math.max(maxv,vc[i]-vc[i-1]);
            }
       int ans=(int)((long ) maxh * maxv % 1000000007);
         return ans;
        }
       
       
        
    }

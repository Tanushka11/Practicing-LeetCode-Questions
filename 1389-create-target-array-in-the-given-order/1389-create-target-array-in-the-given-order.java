class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        ArrayList<Integer> list =new ArrayList<>();
        
        for(int i=0;i<index.length;i++)
        {
            list.add(index[i],nums[i]);
        }
        
        int[] target= new int[nums.length];
        
        for(int j=0;j<nums.length;j++)
        {
            target[j]=list.get(j);
        }
        
        return target;
            }
}
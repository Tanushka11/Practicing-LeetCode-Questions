class Solution {
    public double minimumAverage(int[] nums) {
        Double[] averages = new Double[nums.length/2];
        Arrays.sort(nums);

        int i = 0;
        int j = nums.length - 1;
        int k = 0;
        while(k<averages.length && i<j){
            double avrg = (double)(nums[i] + nums[j])/2;
            averages[k] = avrg;
            i++;
            j--;
            k++;
        }
        double min = Integer.MAX_VALUE;
        for(int m = 0; m<averages.length; m++){
            if(averages[m] < min){
                min = averages[m] ;
            }
        }
        return min;
    }
}
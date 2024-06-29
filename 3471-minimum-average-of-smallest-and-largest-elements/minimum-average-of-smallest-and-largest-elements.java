class Solution {
    public double minimumAverage(int[] nums) {
        double min = Integer.MAX_VALUE;

        ArrayList<Double> averages = new ArrayList<>();
        ArrayList<Integer> Nums = new ArrayList<>();

        for(int i = 0; i<nums.length; i++){
            Nums.add(nums[i]);
        }
        int times = nums.length/2;
        for(int i = 0; i<times; i++){
            int minElement = findSmallElement(Nums);
            int maxElement = findMaxElement(Nums);
            double avrg = (double)(minElement + maxElement)/2;
            averages.add(avrg);
        }
        System.out.print(averages);
        for(int i = 0; i<averages.size(); i++){
            if(averages.get(i) < min){
                min = averages.get(i) ;
            }
        }
        return min;
    }
    int findSmallElement(ArrayList<Integer> arr){
        int min = Integer.MAX_VALUE;
        int k = 0;
        for(int i = 0; i<arr.size(); i++){
            if(arr.get(i) < min){
                min = arr.get(i);
                k = i;
            }
        }
        arr.remove(arr.get(k));
        return min;
    }
    int findMaxElement(ArrayList<Integer> arr){
        int max = Integer.MIN_VALUE;
        int k = 0;
        for(int i = 0; i<arr.size(); i++){
            if(arr.get(i) > max){
                max = arr.get(i);
                k = i;
            }
        }
        arr.remove(arr.get(k));
        return max;
    }
}
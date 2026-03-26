class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double wind=0;
        int sum=0;
        for(int i=0;i<k;i++){
            wind+=nums[i];
        }
        double maxsum=wind;
        for(int i=k;i<nums.length;i++){
        wind+=nums[i]-nums[i-k];
        maxsum=Math.max(wind,maxsum);
        }
        return maxsum/k;
    }
}
class Solution {
    public int longestOnes(int[] nums, int k) {
        int maxcnt=0;
        int n=nums.length;
         for(int i=0;i<n;i++){
        int zeroes=0;
for(int j=i;j<n;j++){
    if(nums[j]==0){
        zeroes++;
    }
    if(zeroes>k){
        break;
    }
    maxcnt=Math.max(maxcnt,j-i+1);
}
        }
        return maxcnt;
    }
}
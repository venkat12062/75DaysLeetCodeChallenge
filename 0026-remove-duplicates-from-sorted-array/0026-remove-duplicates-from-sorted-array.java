class Solution {
    public int removeDuplicates(int[] nums) {
        int res=0;

        for(int j=res+1;j<nums.length;j++){
            if(nums[res]!=nums[j]){
                nums[res+1]=nums[j];
                res++;
            }
        }

        return (res+1);
    }
}
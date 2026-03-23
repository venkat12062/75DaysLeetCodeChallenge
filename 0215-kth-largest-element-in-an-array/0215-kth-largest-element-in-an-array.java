class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> min=new PriorityQueue<>();
        //PriorityQueue<Integer> max=new PriorityQueue<>();

        for(int i=0;i<nums.length;i++){
            min.add(-nums[i]);
          
        }
        for(int i=0;i<k-1;i++){
            min.remove();
        }
        return -min.peek();
    }
}
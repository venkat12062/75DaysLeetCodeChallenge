import java.util.*;

class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int n1 = nums1.length;
        int n2 = nums2.length;
        int[] ng = new int[n1];
        
        Arrays.fill(ng, -1);
        
        for(int i = 0; i < n1; i++){
            int ele = nums1[i];
            int idx = -1;
            
            for(int j = 0; j < n2; j++){
                if(nums2[j] == ele){
                    idx = j;
                    break;
                }
            }
            
            for(int k = idx + 1; k < n2; k++){
                if(nums2[k] > ele){
                    ng[i] = nums2[k];
                    break;
                }
            }
        }
        
        return ng;
    }
}
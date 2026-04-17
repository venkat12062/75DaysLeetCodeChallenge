class Solution {
    public int[] findDegrees(int[][] matrix) {
        
        int n = matrix.length;
        int[] ans = new int[n];
        
        for(int i = 0; i < n; i++){
            int cnt=0;
            
            for(int j = 0; j < n; j++){
                cnt += matrix[i][j];
            }
            
            ans[i] = cnt;
        }
        
        return ans;
    }
}
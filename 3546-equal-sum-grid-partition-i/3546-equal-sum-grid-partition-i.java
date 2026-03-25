class Solution {
    public boolean canPartitionGrid(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        long total = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                total += grid[i][j];
            }
        }
        long curr = 0;
        for (int r = 0; r < m - 1; r++) {
            for (int j = 0; j < n; j++) {
                curr += grid[r][j];
            }

            if (curr == total - curr) {
                return true;
            }
        }
        curr = 0;
        for (int c = 0; c < n - 1; c++) {
            for (int i = 0; i < m; i++) {
                curr += grid[i][c];
            }

            if (curr == total - curr) {
                return true;
            }
        }

        return false;
    }
}
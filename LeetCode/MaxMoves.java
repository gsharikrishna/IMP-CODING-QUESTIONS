class Solution {

    public int maxMoves(int[][] grid) {

        int n = grid.length;
        int m = grid[0].length;
        int dp[][]=new int[n][m];
        for(int arr[]:dp)
        {
            Arrays.fill(arr,-1);
        }
        int result = 0;

        for (int i = 0; i < n; i++) {
            result = Math.max(result, findMinMoves(i, 0, grid, -1,dp));
        }
        return result;
    }

    public int findMinMoves(int row, int col, int[][] grid, int prev,int dp[][]) {
        if (row < 0 || row >= grid.length || col >= grid[0].length) {
            return -1;
        }
        if (grid[row][col] <= prev) {
            return -1;
        }
        if(dp[row][col]!=-1)
            return -1;
        int top = 1 + findMinMoves(row - 1, col + 1, grid, grid[row][col],dp);
        int left = 1 + findMinMoves(row, col + 1, grid, grid[row][col],dp);
        int bottom = 1 + findMinMoves(row + 1, col + 1, grid, grid[row][col],dp);


        return dp[row][col]=Math.max(top, Math.max(left, bottom));
    }
}

/*
 * @lc app=leetcode.cn id=63 lang=java
 *
 * [63] 不同路径 II
 */

// @lc code=start
class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int row=obstacleGrid.length,column=obstacleGrid[0].length;
        int[][] dp = new int[row][column];
        //只要  第一行 或者第一列 碰到第一个障碍物，就无法走到后面了
        for(int i=0;i<row;i++){
            if(obstacleGrid[i][0] == 1) {break;}
            dp[i][0] = 1;
        }
        for(int i=0;i<column;i++){
            if(obstacleGrid[0][i] == 1) {break;}
            dp[0][i] = 1;
        }
        for(int i=1;i<row;++i){
            for(int j=1;j<column;++j){
                dp[i][j] = obstacleGrid[i][j] == 1?0:dp[i-1][j]+dp[i][j-1];
            }
        }
        return dp[row-1][column-1];
        // 滚动数组
        // int m=obstacleGrid.length,n=obstacleGrid[0].length;
        // int[] f = new int[n];

        // f[0] = obstacleGrid[0][0] == 0 ? 1:0;

        // for(int i=0;i<m;++i){
        //     for(int j=0;j<n;++j){
        //         if(obstacleGrid[i][j] == 1){
        //             f[j] = 0;
        //             continue;
        //         }
        //         if(j-1>=0 && obstacleGrid[i][j] == 0){
        //             f[j] += f[j-1];
        //         }
        //     }
        // }
        // return f[n-1];
    }
}
// @lc code=end


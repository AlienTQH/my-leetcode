/*
 * @lc app=leetcode.cn id=62 lang=java
 *
 * [62] 不同路径
 */

// @lc code=start
class Solution {
    public int uniquePaths(int m, int n) {
        if(m<1||n<1) return 0;
        
        int[][] method_num= new int[m][n];
        for(int i=0;i<m;i++){
            method_num[i][0] = 1;
        }
        for(int j=0;j<n;j++){
            method_num[0][j] = 1;
        }
        for(int i=1;i<m;i++){
            for(int j=1;j<n;j++){
                method_num[i][j] = method_num[i-1][j]+method_num[i][j-1];
            }
        }
        return method_num[m-1][n-1];
    }
}
// @lc code=end


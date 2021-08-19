/*
 * @lc app=leetcode.cn id=240 lang=java
 *
 * [240] 搜索二维矩阵 II
 */

// @lc code=start
class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        boolean is_exists = false; 
        if(matrix.length!=0){
            int i = 0;
            int j = matrix[0].length-1;
            while(i<matrix.length&&j>=0){
                if(target == matrix[i][j]){
                    is_exists = true;
                    break;
                }
                else if(target <  matrix[i][j]) 
                {
                    j--;
                }
                else if(target >  matrix[i][j]){
                    i++;
                }
            }
        }
        System
        return is_exists;
    }
}
// @lc code=end


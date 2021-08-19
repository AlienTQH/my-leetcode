/*
 * @lc app=leetcode.cn id=378 lang=java
 *
 * [378] 有序矩阵中第K小的元素
 */

// @lc code=start
class Solution {
    public int kthSmallest(int[][] matrix, int k) {
        int n = matrix.length;
        int left = matrix[0][0];
        int right = matrix[n-1][n-1];

        // 二分查找
        while(right > left){
            int mid = left + (right -left)/2;
            if(checkLessThank(matrix, mid , k)){
                left = mid +1;
            }
            else{
                right = mid;
            }
        }
        return left;
    }

    // 小于等于mid的数量少于k
    public Boolean checkLessThank(int[][] matrix, int mid, int k){
        int num = 0;
        int j = 0;
        int i = matrix.length -1;
        while(i >=0 && j<matrix.length){
            if(matrix[i][j] <= mid){
                j++;
                num += i+1;
            }
            else
            {
                i--;
            }
            if(num>=k) return false;
        }
        return true;
    }
}
// @lc code=end


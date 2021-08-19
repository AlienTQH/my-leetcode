/*
 * @lc app=leetcode.cn id=718 lang=java
 *
 * [718] 最长重复子数组
 */

// @lc code=start
class Solution {
    public int findLength(int[] A, int[] B) {
        int n = A.length, m = B.length;
        int ret = 0;
        // 固定 A，移动B
        for (int i=0;i<n;i++){
            int len= Math.min(m, n-i);
            int maxlen = maxLength(A, B, i, 0, len);
            ret = Math.max(ret, maxlen);
        }
        // 固定B，移动A
        for(int i=0;i<m;i++){
            int len = Math.min(n, m-i);
            int maxlen = maxLength(A, B, 0, i, len);
            ret = Math.max(ret, maxlen);
        }
        return ret;
    }
    public int maxLength(int[] A, int[] B, int addA, int addB, int len) {
        int ret = 0, k = 0;
        for (int i = 0; i < len; i++) {
            if (A[addA + i] == B[addB + i]) {
                k++;
            } else {
                k = 0;
            }
            ret = Math.max(ret, k);
        }
        return ret;
    }
}
// @lc code=end


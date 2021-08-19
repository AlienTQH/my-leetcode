/*
 * @lc app=leetcode.cn id=7 lang=java
 *
 * [7] 整数反转
 */

// @lc code=start
class Solution {
    public int reverse(int x) {
        long da = 0;
        while (x!=0){
            da = da * 10 + x % 10 ;
            x = x / 10;
        }
        if(-2147483648<da && da<2147483647){
            return (int) da;
        }else
        return 0;
    }
}
// @lc code=end


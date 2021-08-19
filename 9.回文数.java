/*
 * @lc app=leetcode.cn id=9 lang=java
 *
 * [9] 回文数
 */

// @lc code=start
class Solution {
    public boolean isPalindrome(int x) {
        int data = 0;
        int old_x = x;
        if(x<0){
            return false;
        }else {
            while (x!=0){
                int yushu = x % 10;
                data = 10 * data + yushu;
                x /= 10;
            }
            if(data != old_x){
                return false;
            }
            else return true;
        }
    }
}
// @lc code=end


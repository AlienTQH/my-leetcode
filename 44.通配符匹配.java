/*
 * @lc app=leetcode.cn id=44 lang=java
 *
 * [44] 通配符匹配
 */

// @lc code=start
class Solution {
    public boolean isMatch(String s, String p) {
        /**
         * 时间复杂度O(n)
         * 空间复杂度O(1)
         */
        int s_index = 0;
        int p_index = 0;
        int match = 0;
        int star = -1;
        while(s_index < s.length()){
            if(p_index <p.length() && (s.charAt(s_index)==p.charAt(p_index)||p.charAt(p_index) == '?')){
                s_index ++;
                p_index ++;
            }
            else if(p_index <p.length() && p.charAt(p_index)=='*'){
                star = p_index;
                match = s_index;
                p_index++;
            }
            else if(star!=-1){
                p_index = star +1;
                match++;
                s_index = match;
            }
            else return false;
        }
        while(p_index<p.length() && p.charAt(p_index)=='*'){
            p_index ++;
        }
        return p_index == p.length();
    }
}
// @lc code=end


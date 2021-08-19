/*
 * @lc app=leetcode.cn id=28 lang=java
 *
 * [28] 实现 strStr()
 */

// @lc code=start
class Solution {
    public int strStr(String haystack, String needle) {
        if(needle == ""){
            return 0;
        }
        if(haystack == ""){
            return -1;
        }
 
        int j = 0;
        int i = 0;
        int flag = 0;
        for(;i<haystack.length()&&flag<haystack.length();){
            // fuck
            if(j<needle.length()){
                if(haystack.charAt(flag)!=needle.charAt(j))
                {
                  i++;
                  flag=i;
                  j=0;
                }
                else
                {
                  flag++;
                  j++;
                } 
            }
            else
            break;
            
        }
        if(flag==haystack.length()&&j!=needle.length()){
            return -1;
        }
        if(j==needle.length()){
            return i;
        }
        else
        return -1;
    }
}
// @lc code=end


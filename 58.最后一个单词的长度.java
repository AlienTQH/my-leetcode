/*
 * @lc app=leetcode.cn id=58 lang=java
 *
 * [58] 最后一个单词的长度
 */

// @lc code=start
class Solution {
    public int lengthOfLastWord(String s) {
        int ans = 0;
        int temp = 0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==' '){
                if(ans!=0){
                    temp = ans;
                }
                ans = 0; 
            }else{
               ans ++;
            }
        }
        if(temp>0&&ans==0){
            return temp;
        }
        else
        return ans;

    }
}
// @lc code=end


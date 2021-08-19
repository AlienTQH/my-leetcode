/*
 * @lc app=leetcode.cn id=13 lang=java
 *
 * [13] 罗马数字转整数
 */

// @lc code=start
class Solution {
    public int romanToInt(String s) {
        int n = s.length();
        int romandata = 0;
        for (int i=0;i<n;i++){
            switch(s.charAt(i)){
                case 'I': romandata += 1; break;
                case 'V': romandata += 5; break;
                case 'X': romandata += 10; break;
                case 'L': romandata += 50; break;
                case 'C': romandata += 100; break;
                case 'D': romandata += 500; break;
                case 'M': romandata += 1000; break;
            }
            if(i!=0){
                if((s.charAt(i)=='V'||s.charAt(i)=='X') && s.charAt(i-1)=='I'){
                    romandata = romandata -2;
                }
                if((s.charAt(i)=='L'||s.charAt(i)=='C') && s.charAt(i-1)=='X'){
                    romandata = romandata -20;
                }
                if((s.charAt(i)=='D'||s.charAt(i)=='M') && s.charAt(i-1)=='C'){
                    romandata = romandata -200;
                }
            }
            

        }
        return romandata;
    }
}
// @lc code=end


import java.util.Stack;

import org.omg.PortableInterceptor.ClientRequestInfo;

/*
 * @lc app=leetcode.cn id=70 lang=java
 *
 * [70] 爬楼梯
 */

// @lc code=start
class Solution {
    public int climbStairs(int n) {
        if(n==1||n==0)
        return 1;
        if(n==2)
        return 2;
        int stairsOne = 1;
        int stairsTwo = 2;
        int staisN = 0;
        for(int i=3;i<=n;i++){
            staisN = stairsOne + stairsTwo;
            stairsOne = stairsTwo;
            stairsTwo = staisN;
        }
        return staisN;
        
    }
}
// @lc code=end


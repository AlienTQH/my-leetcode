/*
 * @lc app=leetcode.cn id=509 lang=java
 *
 * [509] 斐波那契数
 */

// @lc code=start
class Solution {
    public int fib(int N) {
        if(N==0)
        return 0;
        if(N==1)
        return 1;
        int fibonacciZero = 0;
        int fibonacciOne = 1;
        int fibonacciN = 0;
        for(int i=2;i<=N;i++){
            fibonacciN =  (fibonacciOne + fibonacciZero)%1000000007 ;
            fibonacciZero = fibonacciOne;
            fibonacciOne = fibonacciN;
        } 
        return fibonacciN;
    }
}
// @lc code=end


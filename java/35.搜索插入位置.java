/*
 * @lc app=leetcode.cn id=35 lang=java
 *
 * [35] 搜索插入位置
 */

// @lc code=start
class Solution {
    public int searchInsert(int[] nums, int target) {
        int i=0;
        for(;i<nums.length;i++){
            if(target<=nums[i]){
                break;
            }
        }
        return i;
    }
}
// @lc code=end


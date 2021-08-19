/*
 * @lc app=leetcode.cn id=26 lang=java
 *
 * [26] 删除排序数组中的重复项
 */

// @lc code=start
class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums.length<=1){
            return nums.length;
        }
        int i = 0;
        for(;i<nums.length;){
            int j=i+1;
            for(;j<nums.length;j++){
                if(nums[i]!=nums[j]){
                    i=i+1;
                    nums[i] = nums[j];
                }
            }
            if(j>=nums.length){
                break;
            }
        }
        return i+1;
    }
}
// @lc code=end


/*
 * @lc app=leetcode.cn id=27 lang=java
 *
 * [27] 移除元素
 */

// @lc code=start
class Solution {
    public int removeElement(int[] nums, int val) {
        int i = 0;
        for(;i<nums.length;){
            int j= i;
            for (;j<nums.length;){
                if(nums[j] != val){
                    nums[i] =nums[j];
                    i++;
                    j++;
                }
                else{
                    j++;
                }
            }
            if(j == nums.length){
                break;
            }
        }
        // System.out.println(nums.toString());
        // System.out.println(i);
        return i;
    }
}
// @lc code=end


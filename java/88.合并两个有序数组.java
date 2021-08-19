/*
 * @lc app=leetcode.cn id=88 lang=java
 *
 * [88] 合并两个有序数组
 */

// @lc code=start
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        for(int i=0;i<n;i++)
        {
            nums1[m+i] = nums2[i];
        }
       
        int last_exchange_index = 0;
        int sort_border = m+n-1;
        for(int i=0;i<m+n;i++){
            boolean is_sorted = true;
            for(int j=0;j<sort_border;j++){
                if(nums1[j] > nums1[j+1]){
                    int temp = nums1[j];
                    nums1[j] = nums1[j+1];
                    nums1[j+1] = temp;

                    is_sorted = false;
                    last_exchange_index = j;
                }
            }
            sort_border = last_exchange_index;
            if(is_sorted){
                break;
            }
        }

    }
}
// @lc code=end


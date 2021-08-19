import java.util.ArrayList;
import java.util.List;
/*
 * @lc app=leetcode.cn id=119 lang=java
 *
 * [119] 杨辉三角 II
 */

// @lc code=start
class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<List<Integer>> ans = new ArrayList<>();
    
        List<Integer> temp = new ArrayList<>();
        temp.add(1);
        ans.add(temp);
        if(rowIndex==0) {
            
            return ans.get(0);
        }
        
        List<Integer> temp_2 = new ArrayList<>();
        temp_2.add(1);
        temp_2.add(1);
        ans.add(temp_2);
        if(rowIndex==1) {
            return ans.get(1);
            
        }
        int row = 2;
        while(row <=rowIndex){
            List<Integer> temp_3 = new ArrayList<>();
            temp_3.add(1);
            for(int i=1;i<row;i++){
                int val_1 = ans.get(row-1).get(i-1);
                int val_2 = ans.get(row-1).get(i);
                temp_3.add(val_1+val_2);
            }
            temp_3.add(1);
            ans.add(temp_3);
            row++;

        }
        return ans.get(rowIndex);
    }
}
// @lc code=end


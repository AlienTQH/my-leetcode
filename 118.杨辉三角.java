import java.util.ArrayList;
import java.util.List;

/*
 * @lc app=leetcode.cn id=118 lang=java
 *
 * [118] 杨辉三角
 */

// @lc code=start
class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans = new ArrayList<>();
    
        if(numRows==0) {return new ArrayList<>();}
        List<Integer> temp = new ArrayList<>();
        temp.add(1);
        ans.add(temp);
        if(numRows==1) {
            
            return ans;
        }
        
        List<Integer> temp_2 = new ArrayList<>();
        temp_2.add(1);
        temp_2.add(1);
        ans.add(temp_2);
        if(numRows==2) {
            return ans;
            
        }
        int row = 3;
        while(row <=numRows){
            List<Integer> temp_3 = new ArrayList<>();
            temp_3.add(1);
            for(int i=1;i<row-1;i++){
                int val_1 = ans.get(row-2).get(i-1);
                int val_2 = ans.get(row-2).get(i);
                temp_3.add(val_1+val_2);
            }
            temp_3.add(1);
            ans.add(temp_3);
            row++;

        }
        return ans;
    }
}
// @lc code=end


/*
 * @lc app=leetcode.cn id=20 lang=java
 *
 * [20] 有效的括号
 */

// @lc code=start
class Solution {
    public boolean isValid(String s) {
        String news = "";
        int news_len = 0;
        if(s.length() == 0){
            return true;
        }
        for(int i=0;i<s.length();i++){
            switch(s.charAt(i)){
                case '(': {
                    news += "(";
                    news_len += 1;
                    break;
                }
                
                case '[': news += "[";news_len += 1;break;
                case '{': news += "{";news_len += 1;break;
                case ')': {
                    if(news.length()!=0){
                        if(news.charAt(news_len-1) == '('){
                            news = news.substring(0, news_len-1);
                            news_len-=1;
                            break;
                        }
                        else
                        return false;
                    }
                    else{
                        news += ")";
                        news_len += 1;
                    }
                }
                case ']': {
                    if(news.length()!=0){
                        if(news.charAt(news_len-1) == '['){
                            news = news.substring(0, news_len-1);
                            news_len-=1;
                            break;
                        }
                        else
                        return false;
                    }
                    else{
                        news += "]";
                        news_len += 1;
                    }
                    
                }
                case '}':{
                    if(news.length()!=0){
                        if(news.charAt(news_len-1) == '{'){
                            news = news.substring(0, news_len-1);
                            news_len-=1;
                            break;
                        }
                        else
                        return false;
                    }
                    else{
                        news += "}";
                        news_len += 1;
                    }
                }
                
            }
        }
        if(news.length() == 0){
            return true;
        }
        else
        return false;
    }
}
// @lc code=end


package Mid;

import java.util.HashMap;
import java.util.Map;

/**
 * https://leetcode-cn.com/problems/zui-chang-bu-han-zhong-fu-zi-fu-de-zi-zi-fu-chuan-lcof/
 */
public class lengthOfLongestSubstring {
    public int lengthOfLongestSubstring(String s) {
        //存储最新字符出现的位置
        Map<Character,Integer> dic=new HashMap<>();
        if(s.length()==0)
            return 0;
        int maxlength=1;
        int[] dp=new int[s.length()];
        for(int i=0;i<s.length();i++){
            //前面没有和s[i]相同的字符
            if (i == 0)
                dp[0] = 1;
            else if (!dic.containsKey(s.charAt(i))) {
                dp[i] = dp[i - 1] + 1;
            } else {
                dp[i] = i - dic.get(s.charAt(i)) > dp[i - 1] ? dp[i - 1] + 1 : i - dic.get(s.charAt(i));
            }
            maxlength = Math.max(dp[i], maxlength);
            dic.put(s.charAt(i), i);
        }
        return maxlength;
    }
}

package Mid;
/*https://leetcode-cn.com/problems/ba-zi-fu-chuan-zhuan-huan-cheng-zheng-shu-lcof/*/
public class strToInt {

    public int strToInt(String str) {
        //去除空格
        str=str.trim();
        if(str.length()==0)
            return 0;
        //i为遍历字符串的变量，negative表示整数的符号
        int i=0;
        long res=0;
        boolean negative=false;
        //判断开头是否为正负号与数字
        if(!isnumber(str.charAt(i))){
            if(str.charAt(i)=='+')
                negative=false;
            else if(str.charAt(i)=='-')
                negative=true;
            else
                return 0;
        }
        else{
            res=res*10+str.charAt(i)-'0';
        }
        i++;
        //关键是这里要去除=号，即res>Integer.MAX_VALUE
        while(i<str.length()&&isnumber(str.charAt(i))){
            res=res*10+str.charAt(i)-'0';
            if(res>Integer.MAX_VALUE){
                return negative?Integer.MIN_VALUE:Integer.MAX_VALUE;
            }
            i++;
        }
        return (int) (negative?-res:+res);
    }

    boolean isnumber(char c){
        return c - '0' >= 0 && c - '0' <= 9;
    }
}

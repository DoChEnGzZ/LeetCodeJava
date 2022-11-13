package easy;

import java.util.Arrays;

/**
 * https://leetcode-cn.com/problems/ti-huan-kong-ge-lcof/
 */
public class replaceSpace {

    public static String replaceSpace(String s) {
        char[] result=new char[s.length()*3];
        int i=0;
        int j=0;
        char[] source=s.toCharArray();
        while(i<s.length())
        {
            if(source[i]==' '){
                result[j]='%';
                result[++j]='2';
                result[++j]='0';
            }
            else{
                result[j]=source[i];
            }
            i++;
            j++;
        }
        String res=new String(result,0,j);
        return res;
    }
}

package easy;

import java.util.Arrays;

/**
 * https://leetcode-cn.com/problems/zuo-xuan-zhuan-zi-fu-chuan-lcof/
 */
public class reverseLeftWords {
    public String reverseLeftWords(String s, int n) {
        char[] source=s.toCharArray();
        char[] result=new char[s.length()];
        int i=n;
        int j=0;
        while(i<s.length()){
            result[j]=source[i];
            i++;
            j++;
        }
        i=0;
        while(i<n){
            result[j]=source[i];
            i++;
            j++;
        }
        String res=new String(result);
        return res;
//        String result1=s.substring(0,n-1);
//        String result2=s.substring(n,s.length()-1);
//        return result2+result1;
     }
}

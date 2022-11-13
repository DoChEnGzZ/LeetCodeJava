package easy;

import java.util.HashMap;

/**
 * https://leetcode-cn.com/problems/di-yi-ge-zhi-chu-xian-yi-ci-de-zi-fu-lcof/
 */
public class firstUniqChar {
    public static char firstUniqChar(String s) {
        HashMap<Character,Boolean> charmap=new HashMap<Character,Boolean>();
        char[] stringarray=s.toCharArray();
        for(char c:stringarray){
            if(!charmap.containsKey(c)){
                charmap.put(c,true);
            }
            else{
                charmap.put(c,false);
            }
        }
        char result = ' ';
        for(char c:stringarray){
            if(charmap.get(c)==true){
                result=c;
                break;
            }
        }
        return result;
    }
}

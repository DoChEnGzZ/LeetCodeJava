package easy;
/*https://leetcode-cn.com/problems/fan-zhuan-dan-ci-shun-xu-lcof/*/
public class reverseWords {
    public static String reverseWords(String s) {
//        int index=-1,i;
//        String result= "";
//        for(i=0;i<s.length();i++)
//        {
//            if(s.charAt(i)==' '){
//                //连续空格
//                if (i != index + 1) {
//                    String sub = s.substring(index + 1, i);
//                    if(sub!=" ") {
//                        if(result=="")
//                            result=sub;
//                        else
//                            result = sub + " " + result;
//                    }
//                }
//                index=i;
//            }
//        }
//        if(index!=s.length()-1){
//        String sub=s.substring(index+1);
//            if(result=="")
//                result=sub;
//            else
//                result = sub + " " + result;
//        }
//        return result;
        s=s.trim();
        StringBuilder result=new StringBuilder();
        int i=s.length()-1,j=i;
        while(i>=0){
            while(s.charAt(i)!=' '&&i>=0)
                i--;
            result.append(s.substring(i+1,j+1)+" ");
            while(s.charAt(i)==' '&&i>=0)
                i--;
            j=i;
        }
        return result.toString().trim();
    }
}

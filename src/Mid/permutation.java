package Mid;

import java.util.*;

/*https://leetcode-cn.com/problems/zi-fu-chuan-de-pai-lie-lcof/*/
public class permutation {

    public static void main(String[] args) {
        permutation permutation=new permutation();
        permutation.permutation("abc");
    }


    public String[] permutation(String s){
        Set<String> res=new HashSet<>();
        Boolean[] visited=new Boolean[s.length()];
        Arrays.fill(visited, false);
        dfs(s.toCharArray(),"",res,visited);
        return res.toArray(new String[0]);
    }


    public void dfs(char[] chars,String prefix,Set<String> res,Boolean[] visited){
        if(prefix.length()==chars.length){
            res.add(prefix);
            return;
        }
            for(int i=0;i<chars.length;i++)
            {
                if(visited[i])
                    continue;
                visited[i]=true;
                dfs(chars,prefix+String.valueOf(chars[i]),res,visited);
                visited[i]=false;
            }
    }

    public String[] recur(String s) {
        if(s.length()==0)
            return new String[0];
        else if(s.length()==1)
            return new String[]{s};
//        char[] sc=s.toCharArray();
        Set<String> stringSet=new HashSet<>();
        for(int i=0;i<s.length();i++){
            String[] suffix=recur(s.substring(0,i)+s.substring(i+1,s.length()));
            for(int j=0;j<suffix.length;j++)
            {
                stringSet.add(s.substring(i,i+1)+suffix[j]);
            }
        }
        return stringSet.toArray(new String[0]);
    }
}

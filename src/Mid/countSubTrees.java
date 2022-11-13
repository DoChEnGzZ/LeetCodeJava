package Mid;

import java.util.ArrayList;
import java.util.List;

/**
 * https://leetcode-cn.com/problems/number-of-nodes-in-the-sub-tree-with-the-same-label/
 */
public class countSubTrees {
    public int[] countSubTrees(int n, int[][] edges, String labels) {
        char[] lablesArray=labels.toCharArray();
        int[] countResult=new int[n];
        //构造一个存储边关系的list数组，每个数组元素是一个list，存储着他的子结点
        List<Integer>[] points=new List[n];
        for(int i = 0; i < n; i++){
            points[i] = new ArrayList<>();
        }
        for(int[] p:edges){
            int node0=p[0];
            int node1=p[1];
            points[node0].add(node1);
            points[node1].add(node0);
        }
        for(int i=0;i<n;i++){
            boolean[] visited=new boolean[n];
            countResult[i]=countKidTreeSameLable(n,i,points,lablesArray[i],lablesArray,visited);
        }
        return countResult;
    }
    public int countKidTreeSameLable(int n,int father,List<Integer>[] points,char label,char[] lables,boolean[] visited){
        int count=0;
        if(lables[father]==label){
            count++;
        }
        visited[father]=true;
        for(int kid:points[father]){
            if(!visited[kid]) {
                count += countKidTreeSameLable(n, kid, points, label, lables, visited);
            }
        }
        return count;
    }
}


package Mid;
/*https://leetcode-cn.com/problems/er-cha-sou-suo-shu-de-hou-xu-bian-li-xu-lie-lcof/*/
public class verifyPostorder {
    public boolean verifyPostorder(int[] postorder) {
        return recur(0,postorder.length-1,postorder);
    }

    //将对应树的区间进行划分，分为左子树｜右子树｜根，其中左子树的所以元素必须小于根，右子树的元素必须大于根。
    public boolean recur(int i,int j,int[] postorder){
        if(i>=j)
            return true;
        else{
            int n=j-1;
            //n为左子树和右子树的分界线
            while (n>=i&&postorder[n]>postorder[j])
                n--;
            //判断左子树是否完全小于右子树元素
            for(int m=i;m<=n;m++)
            {
                if(postorder[m]>postorder[j])
                    return false;
            }
            return recur(i,n,postorder)&&recur(n+1,j-1,postorder);
        }
    }
}

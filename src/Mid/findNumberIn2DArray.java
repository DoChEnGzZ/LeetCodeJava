package Mid;
/**
 * https://leetcode-cn.com/problems/er-wei-shu-zu-zhong-de-cha-zhao-lcof/
 */
public class findNumberIn2DArray {
    public boolean findNumberIn2DArray(int[][] matrix, int target) {
        if(matrix.length==0)
            return false;
        for(int i=0;i<matrix[0].length;i++){
            if(matrix[0][i]==target)
                return true;
            else if(matrix[0][i]<target){
                for(int j=1;j<matrix.length;j++)
                {
                    if(matrix[j][i]==target)
                        return true;
                    else if(matrix[j][i]>target)
                        break;
                }
            }
            else
                break;
        }
        return false;
    }
}

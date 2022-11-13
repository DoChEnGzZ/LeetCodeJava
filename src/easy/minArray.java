package easy;

/**
 * https://leetcode-cn.com/problems/xuan-zhuan-shu-zu-de-zui-xiao-shu-zi-lcof/
 */
public class minArray {
    public int minArray(int[] numbers){
        int i;
//        if(numbers.length==0)
//            return -1;
//        else if(numbers.length==1)
//            return numbers[0];
//        else{
//            i=0;
//            while(i<numbers.length-1){
//                if(numbers[i+1]<numbers[i])
//                    return numbers[i+1];
//                i++;
//            }
//        }
//        return numbers[0];
        if(numbers.length==0)
            return -1;
        else if(numbers.length==1)
            return numbers[0];
        else{
            int low=0;
            int high=numbers.length-1;
            while(low<=high){
                int m=(low+high)/2;
                if(numbers[m]<numbers[high]){
                    high=m;
                }
                else if(numbers[m]>numbers[high]){
                    low=m+1;
                }
                else
                    high--;
            }
            i=low;
        }
        return numbers[i];
    }
}

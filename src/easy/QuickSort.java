package easy;

public class QuickSort {
    public static void QuickSort(int[] arr,int low,int high){
        int i=low;
        int j=high;
        int temp;
        if(low>high){
            return;
        }
        int anchor=arr[low];
        while(j>i){
            while(arr[j]>=anchor&&i<j)
                j--;
            while(arr[i]<=anchor&&i<j)
                i++;
            if(j>i)
            {
                temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
        arr[low]=arr[i];
        arr[i]=anchor;
        QuickSort(arr,low,i-1);
        QuickSort(arr,i+1,high);
    }
}

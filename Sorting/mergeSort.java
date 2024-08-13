package module1;

import java.util.Arrays;

public class MergeSort {
    public void mergeSort(int[] num,int beg,int end){
        if(beg<end){
            int m = (end-beg)/2 + beg;
            mergeSort(num,beg,m);
            mergeSort(num,m+1, end);
            merge(num,beg,m,end);
        }
    }
    public void merge(int[] num,int beg,int mid,int end){
        int i=beg;
        int j=mid+1;
        int[] temp = new int[end-beg+1];
        for (int k = 0; k < temp.length; k++){
            if(i <= mid && (j > end || num[i] <= num[j])){
                temp[k] = num[i];
                i++;
            }
            else {
                temp[k] = num[j];
                j++;
            }
        }
        System.arraycopy(temp,0,num,beg,temp.length);
    }
    public static void main(String[] args) {
        MergeSort mergeSort = new MergeSort();
        int[] num = new int[]{2,5,7,2,4,2,8,1,0,9,3,6};
        mergeSort.mergeSort(num,0,num.length-1);
        System.out.println(Arrays.toString(num));
    }
}

package module1;

import java.util.Arrays;

public class mergeSortAltO {
    public void mergeSort(int[] num,int beg,int end){
        if(beg<end){
            int m = (end-beg)/2 + beg;
            mergeSort(num,beg,m);
            mergeSort(num,m+1, end);
            merge(num,beg,m,end);
        }
    }
    public void merge(int[] num,int beg,int mid,int end){
        int x=0;
        int i=beg;
        int j=mid+1;
        int[] temp = new int[end-beg+1];
        while(i<=mid && j<=end){
            if(num[i] <= num[j]) temp[x++] = num[i++];
            else temp[x++] = num[j++];
        }
        while (i <= mid) {
            temp[x++] = num[i++];
        }
        while (j <= end) {
            temp[x++] = num[j++];
        }
//        for (int l = 0; l < temp.length; l++) {
//            num[beg + l] = temp[l];
//        }
        System.arraycopy(temp,0,num,beg,temp.length);
    }
    public static void main(String[] args) {
        mergeSortAltO mergeSortAltO = new mergeSortAltO();
        int[] num = new int[]{2,5,7,2,4,2,8,1,0,9,3,6};
        mergeSortAltO.mergeSort(num,0,num.length-1);
        System.out.println(Arrays.toString(num));
    }
}

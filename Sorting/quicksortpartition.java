package module1;

import java.util.Arrays;

public class  QuickSortpartition {
    public void sort(int[] num){
    	sort(num,0,num.length-1);
    	}
    public void sort(int[] num,int beg,int end){
        if(beg<end) {
            int p = partition(num, beg, end);
            sort(num, beg, p - 1);
            sort(num, p + 1, end);
        }
    }
    private int partition(int[] num,int beg,int end){
        int piv = num[end];
        int x = beg - 1;
        for (int i=beg; i < end;i++){
            if (num[i] < piv){
                x++;
                swap(num,x,i);
            }
        }
        swap(num,x+1,end);
        return x+1;
    }
    private void swap(int[] num,int i,int j){
        int temp=num[i];
        num[i] = num[j];
        num[j] = temp;
    }
    public static void main(String[] args) {
        QuickSortpartition quickSort = new QuickSortpartition();
        int[] num = new int[]{2,5,7,2,4,2,8,1,0,9,3,6};
        quickSort.sort(num);
        System.out.println(Arrays.toString(num));
    }
}

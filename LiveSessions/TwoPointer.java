package module1;
import java.util.Arrays;
public class TwoPointer {	
	public boolean findElemts(int[] arr, int x, int size) {
		int i=0;
		int j=size-1;
		Arrays.sort(arr);
		while(i<j){
			if(arr[i]+arr[j]==x) {
				return true;			}
			if(arr[i]+arr[j]>x) {
				j--;		}
			else {
				i++;			}
		}
		return false;		
	}
	public static void main(String[] args) {		
		int arr[] = {100,200,0,500,350,1,50,40,20};
		 int x=90; 
		 int size=arr.length;		 
		 TwoPointer tp =new TwoPointer();
		 boolean ans =tp.findElemts(arr,x,size);
		 System.out.println(ans);		 
	}
}

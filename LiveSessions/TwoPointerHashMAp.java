package module1;

import java.util.HashMap;
import java.util.Map;
public class TwoPointerHashMAp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {100,200,0,500,350,1,50,40,20};
		 int x=90; 
		 int size=arr.length;		 
		 TwoPointerHashMAp tp =new TwoPointerHashMAp();
		 boolean ans =tp.findElemts(arr,x,size);
		 System.out.println(ans);
	}

public boolean findElemts(int[] arr, int x, int size) {
		
		HashMap<Integer,Integer> hm =new HashMap<>();
		for(int i=0;i<size;i++) {
			if(hm.containsKey(x-arr[i])) {
//				return new int[hm.get(x-arr[i]),i];
				return true;
			}
			hm.put(arr[i], i);

	}
		return false;

}
}

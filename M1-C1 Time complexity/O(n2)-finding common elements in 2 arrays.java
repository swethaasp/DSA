//finding common elements in 2 arrays
package module1;
import java.util.*;

public class SimpleIntersection {

	public List<Integer> intersection(int[] a, int[] b) {
		// TODO Auto-generated method stub
	    List<Integer> result =new ArrayList<>(a.length);
	    for(int x : a) {
	    	for (int y :b) {
	    		if(x==y) {
	    			result.add(x);
	    		}
	    	}
	    }
		
		return result;
	}
	
	
	public static void main(String[] args) {
		
		SimpleIntersection simpleIntersection =new SimpleIntersection();
		System.out.println(simpleIntersection.intersection(new int[] {4,7,5,2,3},new int[] {4,2,3,9,1}));
		

	}

}

//quadratic time complexity O(n2)

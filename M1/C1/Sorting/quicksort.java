//logarithmetic complexity
package module1;

public class BinarySearch {

	
	public boolean binarySearch(int x,int[] sortedNumbers) {
		// TODO Auto-generated method stub
		int start=0;
		int end=sortedNumbers.length;
		while(start<=end) {
			int mid=(end-start)/2 + start;
			if(sortedNumbers[mid]==x) return true;
			else if(sortedNumbers[mid]>x) end=mid-1;
			else start=mid+1;
				
	
		}
		return false;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinarySearch binarySearch =new BinarySearch();
		System.out.println(binarySearch.binarySearch(7,new int[] {1,2,3,4,5,6,7,8,9,10}));
		System.out.println(binarySearch.binarySearch(0,new int[] {1,2,3,4,5,6,7,8,9,10}));
	}

}

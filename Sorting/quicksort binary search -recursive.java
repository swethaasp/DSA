//Quick Sort - binary search in recursive way 
// dont maintain the order of insertion 

package module1;

public class QuickSort {

	public static void main(String[] args) {
		QuickSort binarySearch =new QuickSort();
		System.out.println(binarySearch.binarySearch(7, new int[] {1,2,3,4,5,6,7,8,9,10}));
		System.out.println(binarySearch.binarySearch(0, new int[] {1,2,3,4,5,6,7,8,9,10}));
	}

	public boolean binarySearch(int x, int[] sortedNumbers) {
		return binarySearch(x,sortedNumbers,0,sortedNumbers.length-1);
	}

	public boolean binarySearch(int x, int[] sortedNumbers, int start, int end) {
		if(start<=end) {
			int mid=(end-start)+start;
			if(sortedNumbers[mid]==x) return true;
			if(sortedNumbers[mid]>x)  
				return binarySearch(x,sortedNumbers,start,mid-1);
			return  binarySearch(x,sortedNumbers,mid+1,end);
		}
	

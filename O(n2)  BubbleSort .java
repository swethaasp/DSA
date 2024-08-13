package module1;
import java.util.*;
public class BubbleSort {

	public static void main(String[] args) {
		BubbleSort bubbleSort = new BubbleSort();
		int[] numbers =new int[] {2,5,7,2,4,2,8,1,0};
		int[] numbers1 =new int[] {2,5,7,2,4,2,8,1,0};
		int[] numbers2 =new int[] {2,5,7,2,4,2,8,1,0};
		bubbleSort.sort(numbers);
		bubbleSort.sortImprovemnet1(numbers1);
		bubbleSort.sortImprovemnet2(numbers2);
		System.out.println(Arrays.toString(numbers));
		System.out.println(Arrays.toString(numbers1));
		System.out.println(Arrays.toString(numbers2));
	}


  public void sort(int[] numbers) {
	for(int i=1;i<numbers.length;i++) {
		for(int j=0;j<numbers.length-1;j++) {
			if(numbers[j]>numbers[j+1]) {
				int temp=numbers[j];
				numbers[j]=numbers[j+1];
				numbers[j+1]=temp;
			}
		}
	}
		
	}


  	private void sortImprovemnet1(int[] numbers) {
		// TODO Auto-generated method stub
		for(int i=1;i<numbers.length;i++) {
			for(int j=0;j<numbers.length-i;j++) {
				if(numbers[j]>numbers[j+1]) {
					swap(numbers, j , j+1);
				}
			}
		}
		
	}


  //Bubble Sort with Early Termination
  
	private void sortImprovemnet2(int[] numbers) {
		
		int i=0;
		boolean swapOccurred =true;
		while(swapOccurred) {
			swapOccurred=false;
			i++;
			for(int j=0;j<numbers.length-i;j++) {
				if(numbers[j]>numbers[j+1]) {
					swap(numbers,j,j+1);
					swapOccurred=true;
				}
			}
		}
		
	}

	///sortImprovemnet2
//i: Keeps track of the number of passes through the array. Each pass places the next largest element in its correct position.
//swapOccurred: A flag to check if any swaps occurred during the current pass. If no swaps occur, the array is already sorted, and the algorithm can terminate early.
//Outer Loop


	public void swap(int[] numbers, int j, int k) {
		int temp=numbers[j];
		numbers[j]=numbers[k];
		numbers[k]=temp;
		
	}

}

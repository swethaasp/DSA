import java.util.* ;
import java.io.*; 
public class Solution {
	public static void selectionSort(int arr[], int n) {
		// Write your code here.
		for(int i=0;i<n-1;i++){  //upto n-2
			int min=i;
			for(int j=i;j<n;j++) {     //upto last element(i.e n-1)
               if(arr[j]<arr[min]){
				   int temp=arr[min];
				   arr[min]=arr[j];
				   arr[j]=temp;
			   }
			} 
		}
	}
}


//another way
import java.util.* ;
import java.io.*; 
public class Solution {
	public static void selectionSort(int arr[], int n) {
		// Write your code here.
		for(int i=0;i<n-1;i++){  //upto n-2
			int min=i;
			for(int j=i;j<n;j++) {     //upto last element(i.e n-1)
               if(arr[j]<arr[min]){
				   min=j;
			   }
			}
			       int temp=arr[min];
				   arr[min]=arr[i];
				   arr[i]=temp;
		}
	}
}

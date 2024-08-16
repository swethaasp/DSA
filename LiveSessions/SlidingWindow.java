package module1;

public class SlidingWindowProblem {

	public int maxSum(int[] arr,int size,int k) {
		int max_sum=Integer.MIN_VALUE;
		for(int i=0;i<size-k+1;i++) {
			int sum=0;
			for(int j=0;j<k;j++) {
				sum=sum+arr[i+j];
				max_sum=Math.max(sum, max_sum);
			}
			
		}
		return max_sum;
	}
	
	
	public static void main(String[] args) {
		 int arr[] = {100,200,0,500,350,1,50,40,20};
		 int k=4; //window size
		 int size=arr.length;
		 SlidingWindowProblem sw =new SlidingWindowProblem();
		 int y=sw.maxSum(arr, size, k);
		 System.out.println("the maximum sum is "+y);
		 

	}

}

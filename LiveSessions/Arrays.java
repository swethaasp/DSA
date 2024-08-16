package module1;

public class ArrayDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int[]  marks= {45,78,90,23,14,89,67,59,78};
      int size=marks.length;  //size of array
      for(int i=0;i<marks.length;i++) {
    	  System.out.println(marks[i]); //print all the elements in array
      }
      
      int sum=0;
      for(int i=0;i<marks.length;i++) {
    	  sum=sum+marks[i];
      }
      System.out.println("the sum is " +sum);
      
      System.out.println("the average is " + (sum/size));
	}

}

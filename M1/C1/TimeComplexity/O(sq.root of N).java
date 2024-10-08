//worst case :O(x)    -: When x is a large prime number, the algorithm checks up to approximately x factors, making the time complexity close to 𝑂(𝑥)O(x)

//Overall Complexity  O( square root of x)

package module1;
import java.util.*;
public class FindPrimeFactors {

	
	public List<Long> primeFactors(long x) {
	  ArrayList<Long> result =new ArrayList<>();
	  long factor=2;
	  while(x>1) {
		  if(x%factor==0) {
			  result.add(factor);
			  x=x/factor;
		  }
		  else {
			  factor=factor+1;
		  }
	  }
	  return result;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FindPrimeFactors findPrimeFactors =new FindPrimeFactors();
		//System.out.println(findPrimeFactors.primeFactors(12L));
		System.out.println(findPrimeFactors.primeFactors(2100078577L));
		//System.out.println(findPrimeFactors.primeFactors(2100078578L));
		
	}

}



Notice that in each pair, one factor is less than or equal to 
𝑛
n
​
 , and the other factor is greater than or equal to 
𝑛
n
​
 . This is due to the multiplication property where:

If both factors were greater than 
𝑛
n
​
 , their product would exceed 
𝑛
n, which is not possible.
Conversely, if both factors were less than 
𝑛
n
​
 , their product would be less than 
𝑛
n, which would again not cover all possible factor pairs.

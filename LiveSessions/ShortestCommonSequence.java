package module1;

 
public class ShortestCommonSequence {
 
	static int shortestLength(String a, String b)
	{
		int x = a.length();
		int y = b.length();
		int r= lcs(a,b,x,y);
		return (x+y-r);
	}
	static int lcs( String a, String b, int x, int y)
	{
		  int[][] TwoD = new int[x+1][y+1];
		  for(int i=0; i<=x; i++)
			   {
			        for(int j=0; j<=y; j++)
			        {
			        	if(i==0 || j==0){
			        		TwoD[i][j] = 0;
			        	}
			        	else if( a.charAt(i-1) == b.charAt(j-1))
			        	{
			        		TwoD[i][j] = TwoD[i-1][j-1] + 1;
			        	}
			        	else{
			        		TwoD[i][j] = Math.max(TwoD[i-1][j],TwoD[i][j-1]);
			        	}
			        }
			   }
		  return TwoD[x][y];
	} 
	public static void main(String[] args) {
		String a= "DRTIOPL";
		String b= "TOPLAND";
		System.out.println(" the length of the sequence is " + shortestLength(a,b));
 
	}
 
}

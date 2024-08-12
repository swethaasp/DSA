package module1;

public class BinaryToDecimal {

	public int convertToDecimal(String binary) {
		int result=0;
		int conversion =1;
		
		for(int i=1;i<=binary.length();i++) {
			if(binary.charAt(binary.length()-i)=='1') 
				result+=conversion;	
			conversion*=2;		
		}
		return result;
	}
	
	
	public int convertToDecimalAlt(String binary) {
		int result=0;
		for(int i=1;i<=binary.length();i++) {
			if(binary.charAt(binary.length()-i)=='1')
				result+=Math.pow(2, i-1);
		}
		
		return result;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinaryToDecimal binarytodecimal = new BinaryToDecimal();
         System.out.println(binarytodecimal.convertToDecimal( "10110"));
         System.out.println(binarytodecimal.convertToDecimalAlt("10110"));
	}
}

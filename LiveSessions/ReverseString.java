package module1;

public class ReverseString {
	public static void main(String[] args) {		
		String str="Today is third class Of Java";
		String rev="";		
		for(int i=str.length()-1;i>=0;i--) {
			rev=rev+ str.charAt(i);
		}
		System.out.println(rev);
	}
}

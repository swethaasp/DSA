package module1;

public class Palindrome {

	public static void main(String[] args) {
		String str="level";
		String result="";
		
		int n=str.length();
		
		for(int i=n-1;i>=0;i--) {
			result=result+str.charAt(i);
		}
		
		if(str.toLowerCase().equals(result.toLowerCase())) {
			System.out.println("The string " + str +" is a palindrome");
		}
		else {
			System.out.println("The string " + str +"is not a palindrome");
		}

	}

}

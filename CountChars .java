package module1;

public class CountChars {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     CountChars countChars =new CountChars();
     System.out.println(countChars.countCharacter('a',"Sally sells sea shells on the seashore"));
	}

	public int countCharacter(char c, String str) {
		// TODO Auto-generated method stub
		int count=0;
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)==c) {
				count++;
			}
		}
		return count;
	}

}

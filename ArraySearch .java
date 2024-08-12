package module1;

public class ArraySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArraySearch arraySearch =new ArraySearch();
		System.out.println(arraySearch.search("Allien",new String[] {
				"Interstellar","District 9","Allien","Minority Report","Primer"}));

	}

	public int search(String strToMatch, String[] strArray) {
		// TODO Auto-generated method stub
		for(int i=0;i<strArray.length;i++) {
			if(strArray[i].equals(strToMatch)) {
				return i;
			}
		}
		return -1;
	}

}

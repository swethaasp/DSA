package module1;

public class Duplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Duplicates duplicates = new Duplicates();
    System.out.println(duplicates.containsDuplicates(new int[] {1,2,3,4,5,6,7,8}));
    System.out.println(duplicates.containsDuplicates(new int[] {1,2,3,4,5,6,5,6}));
	}

	public boolean containsDuplicates(int[] numbers) {
		// TODO Auto-generated method stub
	    for(int i=0;i<numbers.length;i++) {
	    	for(int j=0;j<numbers.length;j++) {
	    		if(i!=j && numbers[i]==numbers[j]) return true;
	    	}
	    }
	    return false;
	}

}

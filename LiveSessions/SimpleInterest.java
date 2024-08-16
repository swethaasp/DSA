package module1;
public class simpleint {	
	public int calculateInterest(int p, int i, int t) {
		int SI = (p* i*t)/100;
		return SI;
	}
	public static void main(String[] args) {
		int p =42000;
		int i=5;
		int t=2;
		simpleint obj =new simpleint();
		int SI= obj.calculateInterest(p,i,t);
		System.out.println(SI);
		int amount =SI + p;
		System.out.println(amount);
		}
}

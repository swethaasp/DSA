package module1;

public class Linkedlist_arrToLinkedlist {

	
   class Node{
		int data;
		Node next;
		Node(int data1,Node next1){
			this.data=data1;
			this.next=next1;
		}
		
		Node(int data1){
			this.data=data1;
			this.next=null;
		}
	}
	
	private  Node convertArr2Ll(int[] arr) {
		Node head= new Node(arr[0]);
		Node mover=head;
		for(int i=1;i<arr.length;i++) {
			Node temp=new Node(arr[i]);
			mover.next=temp;
			mover=temp;
			
		}
//		/return mover;  8
		return head; //12
	}
	

	
	
	
	public static void main(String[] args) {
		Linkedlist_arrToLinkedlist linkedList = new Linkedlist_arrToLinkedlist();
		int[]  arr= {12,5,6,8};
		
		Node head=linkedList.convertArr2Ll(arr);
		System.out.println(head.data);


		//traverse the ll
		Node temp=head;
		while(temp!=null) {
		 System.out.println(temp.data + " ");
		 temp=temp.next;
		}
	}

}

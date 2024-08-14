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


	   // Override toString() to provide meaningful output
                @Override
                public String toString() {
                return Integer.toString(data);
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

	//length of the ll
	private int lengthOfLL(Node head) {
		int count=0;
		Node temp=head;
		while(temp!=null) {
			temp=temp.next;
			count++;
		}
		return count;
	}

	//searching
	private int checkIfPresent(Node head,int val) {
		Node temp=head;
		while(temp!=null) {
			if(temp.data==val) {
				return 1;
			}
			temp=temp.next;
		}
		return 0;
	}

	//delete head
	private Node removeHead(Node head) {
		if(head==null) return head;
		return head.next;
		
	}

        private void printList(Node head) {
	        Node temp = head;
	        while (temp != null) {
	            System.out.print(temp.data + " ");
	            temp = temp.next;
	        }
	        System.out.println();
	    }


	//delete tail
	 private Node removeTail(Node head) {
		 if(head==null || head.next==null) {
			 return null;
		 }
		 
		 Node temp =head;
		 while(temp.next.next!=null) {
			 temp=temp.next;
		 }
		 temp.next=null;
		 return head;
	 }
	
        
	//remove k th node 
	 private Node removeK(Node head,int k) {
		 if(head==null) return head;
		 if(k==1) {            //k is head
			 Node temp =head;
			 head=head.next;
			 return head;
		 }
		 int count =0;
		 Node temp=head;
		 Node prev =null;
		 while(temp!=null) {
			 count++;
			 if(count==k) {
				prev.next=prev.next.next;   //if k is last node , last before will point to null and last node will deleted.
				break;
			 }
			 prev=temp;
			 temp=temp.next;
			 
		 }
		return head; 
	 }


	//remove a value
	 private Node removeValue(Node head,int value) {
		 if(head==null) {
			 return head;
		 }
		 if(head.data==value) {
			 Node temp =head;
			 head=head.next;
			 return head;
		 }
		 
		 //do linear search to remove that node with the value
		 Node temp=head;
		 Node prev =null;
		 while(temp!=null) {
			 if(temp.data==value) {
				 prev.next=prev.next.next; 
				 break;
			 }
	         prev=temp;
	         temp=temp.next;
		 }
		 return head;
	 }

	//insert at head 
	 private Node insertHead(Node head,int val) {
//		 Node temp=new Node(val,head);
//		 return temp;
		 return new Node(val,head);
		 
	 }


	//insert at end
	 private Node insertEnd(Node head,int val) {
		 if(head==null) return new Node(val);
		 Node temp=head;
		 while(temp.next!=null) {
			 temp=temp.next;
		 }
		 Node newnode = new Node(val);
		 temp.next=newnode;
		 return head ;
	 }


	//insert node at kth index
	private Node insertAtK(Node head,int val,int k) {
		if(head == null && k==1) {
			return new Node(val);
		}
		
		if(k==1) {
			Node temp= new Node(val,head);
			return temp;
		}
		
		int count=0;
		Node temp=head;  //k=3
		
		while(temp!=null) {
		  count++;
		  if(count==k-1) {   //count=2
			Node  newnode= new Node(val);
			newnode.next=temp.next;
			temp.next=newnode;
			  break;
	
		  }
		  temp=temp.next;
		}
		return head;
	 }
	
	
	public static void main(String[] args) {
		Linkedlist_arrToLinkedlist linkedList = new Linkedlist_arrToLinkedlist();
		int[]  arr= {12,5,6,8};
		
		Node head=linkedList.convertArr2Ll(arr);
		//System.out.println(head.data);


		//traverse the ll
		Node temp=head;
		while(temp!=null) {
		 //System.out.println(temp.data + " ");
		 temp=temp.next;
		}

		//length of ll
		System.out.println(linkedList.lengthOfLL(head));  //4

		//search for a element
		System.out.println(linkedList.checkIfPresent(head,5));


		//delete head
		System.out.print("List before removal: ");
                linkedList.printList(head);
		
		head=linkedList.removeHead(head);
		
		
	        System.out.print("List after removal: ");
	        linkedList.printList(head);


		//delete tail of ll
	    
	    System.out.print("List after removing tail: ");
	    linkedList.printList(linkedList.removeTail(head));

		//delete k th element of list
	    System.out.print("List after removing k th element: ");
	    linkedList.printList(linkedList.removeK(head,2));

		//delete node with the value
         System.out.print("List after removing value: ");
        linkedList.printList(linkedList.removeValue(head,6));
	

	//insert at head 
	System.out.print("insert at head : ");
        linkedList.printList(linkedList.insertHead(head,6));


         //insert at end
      	System.out.print("insert at end : ");
        linkedList.printList(linkedList.insertEnd(head,16));

	//insert at kth index
	System.out.print("insert at kth index : ");
       linkedList.printList(linkedList.insertAtK(head,16,2));
	
	}
}

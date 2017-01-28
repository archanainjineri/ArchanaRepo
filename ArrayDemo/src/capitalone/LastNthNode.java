package capitalone;

/*
 * 8->10->5->7->2->1->5->4->10->10
 * Write an algorithm that finds the nth to last element in a linked list

 */
public class LastNthNode {

	public static void main(String[] args) {
		
		LastNthNode obj = new LastNthNode();
		Node head = null;
		int n = 3;
		Node n1 = new Node(8);
		Node n2 = new Node(10);
		Node n3 = new Node(5);
		Node n4 = new Node(7);
		Node n5 = new Node(2);
		Node n6 = new Node(1);
		Node n7 = new Node(5);
		Node n8 = new Node(4);
		Node n9 = new Node(10);
		Node n10 = new Node(10);
		
		head = n1;
		n1.next = n2;
		n2.next = n3;
		n3.next = n4;
		n4.next = n5;
		n5.next = n6;
		n6.next = n7;
		n7.next = n8;
		n8.next = n9;
		n9.next = n10;
		n10.next = null;
		
		
	  obj.printList(head);

	  obj.getLastNthNode(head,n);
	}
	
	public void printList(Node head){
		Node temp = head;
		while(temp!=null){
			System.out.println(temp.getData());
			temp = temp.next;
		}
		
	}
	
	public void getLastNthNode(Node head, int n){
		Node p1 =head;
		Node p2 = head;
		int i =1;
		while(i < n){
			p2 = p2.next;
			i++;
		}
		System.out.println("P2 points to "+ p2.getData());
		while( p2.next != null){
			p1 = p1.next;
			p2 = p2.next;
		}
		System.out.println("Last Nth Node is "+ p1.getData());
		
	}

}

class Node{
	int data;
	Node next;
	
	public Node(int data){
		this.data = data;
	}
	//getter setter
	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

	public Node getNext() {
		return next;
	}

	public void setNext(Node next) {
		this.next = next;
	}	
	
}

 // Definition for singly-linked list.
   class ListNode {
      int val;
     ListNode next;
      ListNode(int x) { val = x; }
  }

public class AddList {
	public static void main(String[] args){
		ListNode list1 = new ListNode(2);
		list1.next = new ListNode(4);
		list1.next.next = new ListNode(3);
		
		ListNode list2 = new ListNode(5);
		list2.next = new ListNode(6);
		list2.next.next = new ListNode(6);
		printList( list1);
		System.out.println();
		printList( list2);
		System.out.println();

		ListNode res = addTwoNumbers(list1,list2);
		printList( res);
		
	}
	
	public static void printList(ListNode list1){
		while(list1 != null){		
		System.out.print(list1.val + " -> ");
		list1 = list1.next;
		}
	}
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {    
    	ListNode DammyHead = new ListNode(0);
    	ListNode cur = DammyHead,p = l1,q = l2;
    	int sum = 0, carry = 0;
    	
    	while(p != null || q!= null){
    		int x = ( p != null)? p.val:0;
    		int y = ( q != null)? q.val:0;
    		sum = x+y+carry;
    		carry = sum / 10;
    		cur.next = new ListNode(sum%10);
    		cur= cur.next;
    		if(p != null) p = p.next;
    		if(q != null) q = q.next;    		
     	}
    	if(carry > 0){
    		cur.next = new ListNode(carry);
    	}
    	       
    	return DammyHead.next;
    }
}

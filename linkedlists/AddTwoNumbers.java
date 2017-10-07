class ListNode{

ListNode next;
int val;

public ListNode(int val){
this.val = val;
}

}
public class AddTwoNumbers{
public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
    ListNode firstHead = new ListNode(0); 
    ListNode curr = firstHead;
    int carry = 0;
    while (l1 != null || l2 != null) {
        int x = (l1 != null) ? l1.val : 0;  //only add value if not null
        int y = (l2 != null) ? l2.val : 0;
        int sum = carry + x + y;
        carry = sum / 10;
        curr.next = new ListNode(sum % 10);  // using modulus operator
        curr = curr.next;
        if (l1 != null) l1 = l1.next;
        if (l2 != null) l2 = l2.next;
    }
    if (carry > 0) {
        curr.next = new ListNode(carry);
    }
    return firstHead.next;
    }	

   public static void main(String [] args){
      System.out.println("Constructing list 3->4->2");
      ListNode listNode1 = new ListNode(3);
      ListNode listNode2 = new ListNode(4);
      ListNode listNode3 = new ListNode(2);
      listNode1.next = listNode2;
      listNode2.next = listNode3;
      listNode3.next=null;
      System.out.println("Constructing list 5->6-4");
      ListNode listNode4 = new ListNode(5);
      ListNode listNode5 = new ListNode(6);
      ListNode listNode6 = new ListNode(4);
      listNode4.next = listNode5;
      listNode5.next = listNode6;
      listNode6.next = null;
      ListNode newList = new AddTwoNumbers().addTwoNumbers(listNode1,listNode4);
      while (newList.next!=null){
 	     System.out.print(newList.val);
             System.out.print("->");
     	     newList = newList.next;
      }	
      System.out.println(newList.val);
   }

}

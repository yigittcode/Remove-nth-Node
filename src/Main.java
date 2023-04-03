
public class Main {
    public static void main(String[] args) {

        ListNode node5 = new ListNode(5,null);
        ListNode node4 = new ListNode(4,node5);
        ListNode node3 = new ListNode(3,node4);
        ListNode node2 = new ListNode(2, node3);
        ListNode node1 = new ListNode(1, node2);

        node3.val = node3.next.next.val;
        node3.next = node3.next.next;
        System.out.println(node3.next.val);
    }
}
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {

        ListNode leftPointer = head;
        ListNode rightPointer = head;


      while (rightPointer != null && n > 0) {
          rightPointer = rightPointer.next;
          n--;
      }

      while ( rightPointer != null && rightPointer.next != null)  {
          rightPointer = rightPointer.next;
          leftPointer = leftPointer.next;
      }
      if (leftPointer == head && rightPointer == null) return head.next;

        leftPointer.next = leftPointer.next.next;
      return head;

    }
}




     class ListNode {
     int val;
     ListNode next;
     ListNode() {


     }
     ListNode(int val) {
         this.val = val;
     }
     ListNode(int val, ListNode next) {
         this.val = val;
         this.next = next;
     }


     }

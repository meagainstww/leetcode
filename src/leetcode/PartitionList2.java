package leetcode;

public class PartitionList2 {
	public ListNode partition(ListNode head, int x) {
		ListNode head1 = new ListNode(0);
		ListNode head2 = new ListNode(0);
		ListNode p1 = head1;
		ListNode p2 = head2;
		while (head != null) {
			if (head.val < x) {
				p1.next = head;
				p1 = p1.next;
			} else {
				p2.next = head;
				p2 = p2.next;
			}
			head.next = null;
	
		}
		    p2.next=null;
			p1.next = head2.next;
		return head1.next;
	}
}

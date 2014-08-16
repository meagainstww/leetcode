package leetcode;
/* Given a list, rotate the list to the right by k places, where k is non-negative.
 * For example:
 * Given 1->2->3->4->5->NULL and k = 2,
 * return 4->5->1->2->3->NULL.
 */
/* 首先从head开始跑，直到最后一个节点，这时可以得出链表长度len。然后将尾指针指向头指针，
 * 将整个圈连起来，接着往前跑len – k%len，从这里断开，就是要求的结果了。
 */
public class RotateList {
	public ListNode rotateRight(ListNode head, int n) {
		if (n == 0 || head == null || head.next == null)
			return head;
		int len = getLength(head);
		n %= len;
		if (n == 0)
			return head;

		ListNode first = head;
		while (n-- > 0)
			first = first.next;
		ListNode oldhead = head;
		while (first.next != null) {
			head = head.next;
			first = first.next;
		}
		ListNode newhead = head.next;
		head.next = null;
		first.next = oldhead;
		return newhead;
	}

	public int getLength(ListNode head) {
		int len = 0;
		while (head != null) {
			head = head.next;
			len++;
		}
		return len;
	}
}

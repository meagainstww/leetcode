package leetcode;
/* Given a sorted linked list, delete all duplicates such that each element appear only once.
 * For example,
 * Given 1->1->2, return 1->2.
 * Given 1->1->2->3->3, return 1->2->3.
 */
public class RemoveDuplicatesfromSortedList {
	 public ListNode deleteDuplicates(ListNode head) {
	        if(head == null || head.next == null)
	            return head;
	 
	        ListNode prev = head;    
	        ListNode p = head.next;
	 
	        while(p != null){
	            if(p.val == prev.val){
	                prev.next = p.next;
	                p = p.next;
	                //no change prev
	            }else{
	                prev = p;
	                p = p.next; 
	            }
	        }
	 
	        return head;
	    }
}

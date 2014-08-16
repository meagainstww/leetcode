package leetcode;

/* Follow up for problem "Populating Next Right Pointers in Each Node".
 * What if the given tree could be any binary tree? Would your previous solution still work?
 * Note:
 * You may only use constant extra space.
 * For example,
 * Given the following binary tree,
 *        1
 *      /  \
 *     2    3
 *    / \    \
 *   4   5    7
 * After calling your function, the tree should look like:
 *        1 -> NULL
 *      /  \
 *     2 -> 3 -> NULL
 *    / \    \
 *   4-> 5 -> 7 -> NULL
 */
public class PopulatingNextRightPointersinEachNodeII {
	public void connect(TreeLinkNode root) {
		if (root == null)
			return;
		if (root.left == null && root.right == null)
			return;
		TreeLinkNode next = new TreeLinkNode(0);
		if (root.next != null) {
			while (true) {

				if (root.left != null) {
					next = root.left;
					break;
				} else if (root.right != null) {
					next = root.right;
					break;
				}
				root = root.next;
				if (root == null) {
					next = null;
					break;
				}
			}
			if (root.left != null && root.right != null) {
				root.left.next = root.right;
				root.right.next = next;
			} else if (root.left != null)
				root.left.next = next;
			else if (root.right != null)
				root.right.next = next;
		}else{
			if(root.left!=null)
				if(root.right!=null){
					root.left.next=root.right;
					root.right.next=null;
				}else{
					root.left.next=null;
				}
			else{
				if(root.right!=null)
					root.right.next=null;
			}
		}
		connect(root.left);
		connect(root.right);
	}
}

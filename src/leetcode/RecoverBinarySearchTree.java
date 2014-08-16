package leetcode;

import java.util.ArrayList;
import java.util.Arrays;

/* Two elements of a binary search tree (BST) are swapped by mistake.
 * Recover the tree without changing its structure.
 */
/* O(n)空间的解法:
 * 中序遍历一遍，重新赋值，这个解法可以面向n个元素错位的情况。
 */
public class RecoverBinarySearchTree {
	public void recoverTree(TreeNode root) {
		ArrayList<TreeNode> list = new ArrayList<TreeNode>();
		ArrayList<Integer> val = new ArrayList<Integer>();
		if (root == null)
			return;
		inorderTraversal(root, list, val);
		Arrays.sort(val.toArray());
		for (int i = 0; i < list.size(); i++) {
			list.get(i).val = val.get(i);
		}

	}

	public void inorderTraversal(TreeNode root, ArrayList<TreeNode> list, ArrayList<Integer> val) {
		if (root != null) {
			inorderTraversal(root.left, list, val);
			list.add(root);
			inorderTraversal(root.right, list, val);
		}
	}
}

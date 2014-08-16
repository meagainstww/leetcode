package leetcode;

import java.util.*;

/* Given a binary tree, return the inorder traversal of its nodes' values.
 * For example:
 * Given binary tree {1,#,2,3},
 *    1
 *      \
 *        2
 *      /
 *    3
 * return [1,3,2].
 * Note: Recursive solution is trivial, could you do it iteratively?
 * OJ's Binary Tree Serialization:
 * The serialization of a binary tree follows a level order traversal, where '#' signifies a path terminator
 * where no node exists below.
 * Here's an example:
 *   1
 *  / \
 * 2   3
 *    /
 *   4
 *    \
 *     5
 * The above binary tree is serialized as "{1,2,3,#,#,4,#,#,5}".
 */
/* Use a stack. Time:O(n) and space O(logn). 
 */
public class BinaryTreeInorderTraversal2 {
	public ArrayList<Integer> inorderTraversal(TreeNode root) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		if (root == null)
			return list;
		Stack<TreeNode> stack = new Stack<TreeNode>();
		TreeNode node = root;
		while (!stack.isEmpty() || node != null) {
			if (node != null) {
				stack.push(node);
				node = node.left;
			} else {
				list.add(stack.peek().val);
				node = stack.pop().right;
			}
		}
		return list;
	}
}

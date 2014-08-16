package leetcode;

/* Given a binary tree, find its maximum depth.
 * The maximum depth is the number of nodes along the longest path from the root node down to the farthest leaf node.
 */
public class MaximumDepthofBinaryTree {
	public int maxDepth(TreeNode root) {
		return helper(root, 0);
	}

	public int helper(TreeNode node, int depth) {
		if (node == null)
			return depth;
		return Math.max(helper(node.left, depth + 1), helper(node.right, depth + 1));
	}
}

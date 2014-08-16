package leetcode;

import java.util.ArrayList;

public class PathSumII2 {
	public ArrayList<ArrayList<Integer>> pathSum(TreeNode root, int sum) {
		ArrayList<ArrayList<Integer>> res = new ArrayList<ArrayList<Integer>>();
		if (root == null)
			return res;
		ArrayList<Integer> curr = new ArrayList<Integer>();
		helper(root, sum, curr, res);
		return res;
	}

	private void helper(TreeNode node, int sum, ArrayList<Integer> current, ArrayList<ArrayList<Integer>> result) {
		if (node == null)
			return;
		current.add(node.val);
		if (node.left == null && node.right == null) {
			if (sum - node.val == 0) {
				ArrayList<Integer> temp = new ArrayList<Integer>(current);
				result.add(temp);
			}
		}

		helper(node.left, sum - node.val, current, result);
		helper(node.right, sum - node.val, current, result);
		current.remove(current.size() - 1);
	}
}

package leetcode;
/* Given a collection of candidate numbers (C) and a target number (T), 
 * find all unique combinations in C where the candidate numbers sums to T.
 * Each number in C may only be used once in the combination.
 * Note:All numbers (including target) will be positive integers.
 * Elements in a combination (a1, a2, … , ak) must be in non-descending order. (ie, a1 ≤ a2 ≤ … ≤ ak).
 * The solution set must not contain duplicate combinations.
 * For example, given candidate set 10,1,2,7,6,1,5 and target 8, 
 * A solution set is: 
 * [1, 7] 
 * [1, 2, 5] 
 * [2, 6] 
 * [1, 1, 6] 
 */
import java.util.*;
public class CombinationSumII {
	public ArrayList<ArrayList<Integer>> combinationSum2(int[] num, int target) {
		Arrays.sort(num);
		ArrayList<ArrayList<Integer>> lists = new ArrayList<ArrayList<Integer>>();
		for (int i = num.length - 1; i >= 0; i--) {
			int sum = 0;
			ArrayList<Integer> list = new ArrayList<Integer>();
			for (int j = i; j >= 0; j--){
				if (sum + num[j] < target) {
					list.add(num[j]);
					sum+=num[j];
				} else if (sum + num[j] == target) {
					list.add(num[j]);
					if(!lists.contains(list));
					lists.add(list);
					if(j!=0)
						list.remove(list.size()-1);
				}
			}
		}
		return lists;
	}
}

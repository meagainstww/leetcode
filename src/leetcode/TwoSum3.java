package leetcode;
/* Given an array of integers, find two numbers such that they add up to a specific target 
 * The function twoSum should return indices of the two numbers such that they add up to the target,
 * where index1 must be less than index2. Please note that your returned answers (both index1 and index2) are not zero-based.
 * You may assume that each input would have exactly one solution.
 * Input: numbers={2, 7, 11, 15}, target=9
 * Output: index1=1, index2=2
 */
import java.util.Hashtable;
/* Time complexity of this solution: O(n)
 */
public class TwoSum3 {
	public int[] twoSum(int[] numbers, int target) {
		int[] a = new int[2];
		Hashtable<Integer, Integer> nums = new Hashtable<Integer, Integer>();
		for (int i = 0; i < numbers.length; i++) {
			// put number into hash table (if it's not already there)
			Integer n = nums.get(numbers[i]);
			if (n == null)
				nums.put(numbers[i], i); // subtract array element from target
											// number
			n = nums.get(target - numbers[i]);
			if (n != null && n < i) {// if such number exists in the table
										// return the indices
				a[0] = n + 1;
				a[1] = i + 1;
				return a;
			}
		}
		return a;
	}

	
}

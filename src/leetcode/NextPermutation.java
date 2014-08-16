package leetcode;

import java.util.*;

/* Implement next permutation, which rearranges numbers into the lexicographically next greater
 * permutation of numbers.If such arrangement is not possible, it must rearrange it as the lowest
 * possible order (ie, sorted in ascending order).
 * The replacement must be in-place, do not allocate extra memory.Here are some examples. 
 * Inputs are in the left-hand column and its corresponding outputs are in the right-hand column.
 * 1,2,3 → 1,3,2
 * 3,2,1 → 1,2,3
 * 1,1,5 → 1,5,1
 */
/* step 1 From right to left find the first number(partition number) which violate increasing trend
 * If not exist, this is the last permutation. (in this problem just reverse the array)
 * step 2 From right to left find the first number(change number)which larger than partition number
 * step 3 Swap partition number and the change number
 * step 4 Reverse all the number on the right of partition index
 */
public class NextPermutation {
	public void nextPermutation(int[] num) {
		if (num.length <= 1)
			return;
		for (int i = num.length - 2; i >= 0; i--) {
			if (num[i] < num[i + 1]) {
				int j;
				for (j = num.length - 1; j >= i; j--)
					if (num[i] < num[j])
						break;
				// swap the two numbers.
				num[i] = num[i] ^ num[j];
				num[j] = num[i] ^ num[j];
				num[i] = num[i] ^ num[j];
				// sort the rest of arrays after the swap point.
				Arrays.sort(num, i + 1, num.length);
				return;
			}
		}
		// reverse the arrays.
		for (int i = 0; i < num.length / 2; i++) {
			int tmp = num[i];
			num[i] = num[num.length - i - 1];
			num[num.length - i - 1] = tmp;
		}
		return;
	}		
}

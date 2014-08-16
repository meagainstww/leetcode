package leetcode;

import java.util.Arrays;

public class PermutationSequence {
	public String getPermutation(int n, int k) {
		int[] num = new int[n];
		for (int i = 0; i < n; i++)
			num[i] = i + 1;
		while (--k > 0) 
			nextPermutation(num);
		StringBuffer str = new StringBuffer();
		for (int i = 0; i < n; i++)
			str.append(num[i]);
		return str.toString();
	}
	public void nextPermutation(int[] num) {
		if (num.length <= 1)
			return;
		for (int i = num.length - 2; i >= 0; i--) {
			if (num[i] < num[i + 1]) {
				int j;
				for (j = num.length - 1; j >= i; j--)
					if (num[i] < num[j])
						break;
				num[i] = num[i] ^ num[j];
				num[j] = num[i] ^ num[j];
				num[i] = num[i] ^ num[j];
				Arrays.sort(num, i + 1, num.length);
				return;
			}
		}
	}
}

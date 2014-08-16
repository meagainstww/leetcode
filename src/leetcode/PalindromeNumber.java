package leetcode;
/* Determine whether an integer is a palindrome. Do this without extra space.
 * 
 */
public class PalindromeNumber {
	public boolean isPalindrome(int x) {
		if (x < 0)
			return false;
		if (reverse(x) == x)
			return true;
		else
			return false;
	}

	public static int reverse(int x) {
		boolean neg = false;
		if (x < 0) {
			x = -x;
			neg = true;
		}
		int result = 0;
		while (x != 0) {
			result = result * 10 + x % 10;
			x /= 10;
		}
		if (neg) {
			return -result;
		}
		return result;
	}
}

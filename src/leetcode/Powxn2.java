package leetcode;
/*Implement pow(x, n).
 */
public class Powxn2 {
	public double pow(double x, int n) {
		if (n == 0)
			return 1.;
		if (x == 0)
			return 0.;
		if (n < 0) {
			n = -n;
			x = 1. / x;
		}
		double res = 1.;
		while (n > 0) {
			if (n % 2 == 1)
				res *= x;
			else 
				x *= x;
			n >>= 1;
		}
		return res;
	}
}

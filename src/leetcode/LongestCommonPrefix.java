package leetcode;

/*Write a function to find the longest common prefix string amongst an array of strings.
 */
public class LongestCommonPrefix {
	public String longestCommonPrefix(String[] strs) {
		int minlength = Integer.MAX_VALUE;
		String prefix = "";
		int n = 0;
		if (strs.length == 0)
			return "";
		if (strs.length == 1)
			return strs[0];
		for (int i = 0; i <= strs.length - 1; i++) {
			if (strs[i].length() == 0)
				return "";
			else if (minlength > strs[i].length()) {
				minlength = strs[i].length();
				n = i;
			}
		}
		for (int index = 0; index <= minlength - 1; index++) {
			char ch = strs[n].charAt(index);

			for (int i = 0; i <= strs.length - 1; i++) {
				if (ch != strs[i].charAt(index))
					return prefix;
			}
			prefix += ch;
		}
		return prefix;
	}
}

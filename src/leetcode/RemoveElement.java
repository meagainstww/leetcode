package leetcode;

/*Given an array and a value, remove all instances of that value in place and return the new length.
 * The order of elements can be changed. It doesn't matter what you leave beyond the new length
 */
public class RemoveElement {
	// 重新建立整个数组
	public int removeElement(int[] A, int elem) {
		int begin = 0;
		for (int i = 0; i < A.length; i++) {
			if (A[i] != elem)
				A[begin++] = A[i];
		}
		return begin;
	}

	// 将后面的元素放到前面
	public int removeElement2(int[] A, int elem) {
		int i = 0;
		int end = A.length - 1;
		while (i < end) {
			if (A[i] == elem) {
				if (A[end] != elem) {
					A[i] = A[end];
					end--;
				}
			} else
				i++;
		}
		return end;
	}

	// 将后面属于数组的元素放到前面
	public int removeElement3(int[] A, int elem) {
		int begin = 0;
		int end = A.length - 1;
		while (begin <= end) {
			if (A[begin] != elem)
				begin++;
			else if (A[end] == elem) {
				end--;
			} else {
				int tmp = A[end];
				A[begin++] = A[end];
				A[end--] = tmp;
			}
		}
		return begin;
	}
}

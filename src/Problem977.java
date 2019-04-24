/**
 * leetcode-977 有序数组的平方
 *
 * @link {https://leetcode-cn.com/problems/squares-of-a-sorted-array/}
 */
public class Problem977 {
    public int[] sortedSquares(int[] A) {
        int start = 0;
        int end = A.length - 1;

        int[] result = new int[A.length];
        int index = A.length - 1;

        while (start <= end) {
            int startNumber = A[start] * A[start];
            int endNumber = A[end] * A[end];
            if (startNumber >= endNumber) {
                result[index] = startNumber;
                start++;
            } else {
                result[index] = endNumber;
                end--;
            }
            index--;
        }

        return result;
    }
}

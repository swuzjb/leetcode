/**
 * leetcode 905 按奇偶排序数组
 * https://leetcode-cn.com/problems/sort-array-by-parity/
 */
public class Problem905 {
    public int[] sortArrayByParity(int[] A) {
        int[] result = new int[A.length];
        int head = 0;
        int tail = A.length - 1;

        for (int i = 0; i < A.length; i++) {
            if (A[i] % 2 == 0) {
                result[head++] = A[i];
            } else {
                result[tail--] = A[i];
            }
        }
        return result;
    }
}

/**
 * leetcode-832 翻转图像
 *
 * @link {https://leetcode-cn.com/problems/flipping-an-image/}
 */
public class Problem832 {

    public int[][] flipAndInvertImage(int[][] A) {
        int[][] result = new int[A.length][A[0].length];
        for (int i = 0; i < A.length; i++) {
            handle(A[i], result[i]);
        }
        return result;
    }

    private void handle(int[] origin, int[] newArray) {
        for (int i = 0; i < origin.length; i++) {
            int flag = origin[origin.length - i - 1];
            newArray[i] = flag == 0 ? 1 : 0;
        }
    }
}

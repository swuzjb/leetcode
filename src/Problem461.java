/**
 * leetcode-461
 * @link {https://leetcode-cn.com/problems/hamming-distance/}
 */
public class Problem461 {
    public int hammingDistance(int x, int y) {
        int temp = x ^ y;
        int result = 0;

        for(int i = 0; i < 32; i++) {
            result += (temp >> i) & 1;
        }
        return result;
    }
}

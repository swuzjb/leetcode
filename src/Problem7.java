/**
 * leetcode-07 整数翻转
 *
 * @link {https://leetcode-cn.com/problems/reverse-integer/}
 */
public class Problem7 {
    public int reverse(int x) {
        int ans = 0;
        while (x != 0) {
            int last = x % 10;
            x = x / 10;
            if (ans > Integer.MAX_VALUE / 10 || (ans == Integer.MAX_VALUE / 10 && last > 7)) {
                return 0;
            }

            if (ans < Integer.MIN_VALUE / 10 || (ans == Integer.MIN_VALUE / 10 && last < -8)) {
                return 0;
            }
            ans = ans * 10 + last;
        }
        return ans;
    }
}

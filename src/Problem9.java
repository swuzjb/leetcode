/**
 * leetcode-9 回文数
 *
 * @link {https://leetcode-cn.com/problems/palindrome-number/}
 */
public class Problem9 {
    public boolean isPalindrome(int x) {
        if (x < 0 || ((x % 10 == 0 && x != 0))) {
            return false;
        }
        int temp = 0;
        while (x > temp) {
            temp = temp * 10 + x % 10;
            x = x / 10;
        }
        return x == temp || x == temp / 10;
    }
}

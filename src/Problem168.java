/**
 * leetcode-168 Excel表列名称
 *
 * @link {https://leetcode-cn.com/problems/excel-sheet-column-title/}
 */
public class Problem168 {

    public String convertToTitle(int n) {
        return n == 0 ? "" : convertToTitle(--n / 26) + (char) (n % 26 + 'A');
    }
}

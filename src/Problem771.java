/**
 * leetcode-771 宝石与石头
 *
 * @link {https://leetcode-cn.com/problems/jewels-and-stones/submissions/}
 */
public class Problem771 {

    public int numJewelsInStones(String J, String S) {
        int num = 0;
        for (int i = 0; i < S.length(); i++) {
            if (J.indexOf(S.charAt(i)) >= 0) {
                num++;
            }
        }
        return num;
    }
}

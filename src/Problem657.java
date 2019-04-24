/**
 * leetcode-657 机器人能否返回原点
 *
 * @link {https://leetcode-cn.com/problems/robot-return-to-origin/}
 */
public class Problem657 {
    public boolean judgeCircle(String moves) {
        int[] count = new int[26];
        for (char c : moves.toCharArray()) {
            count[c - 'A']++;
        }
        return count['L' - 'A'] == count['R' - 'A'] && count['U' - 'A'] == count['D' - 'A'];
    }
}

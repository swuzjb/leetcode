/**
 * leetcode-58 最后一个单词的长度
 * @link {https://leetcode-cn.com/problems/length-of-last-word/}
 */
public class Problem58 {
    public int lengthOfLastWord(String s) {
        int i = s.length() - 1;
        int ans = 0;
        boolean flag = false;
        while (i >= 0) {
            if (s.charAt(i) == ' ') {
                if(flag){
                    return ans;
                }
            } else {
                flag = true;
                ans++;

            }
            i--;
        }
        return ans;
    }
}

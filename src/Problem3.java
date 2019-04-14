import java.util.HashSet;
import java.util.Set;

/**
 * Leetcode-3 无重复字符的最长子串
 *
 * @link {https://leetcode-cn.com/problems/longest-substring-without-repeating-characters/}
 */
public class Problem3 {


    public int lengthOfLongestSubstring(String s) {
        int ans = 0, i = 0, j = 0;
        Set<Character> characterSet = new HashSet<>();
        while (i < s.length() && j < s.length()) {
            if (characterSet.contains(s.charAt(j))) {
                characterSet.remove(s.charAt(i));
                i++;
            } else {
                characterSet.add(s.charAt(j));
                j++;
                ans = Math.max(ans, j - i);
            }
        }

        return ans;
    }
}

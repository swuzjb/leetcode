import java.util.HashMap;
import java.util.Map;

/**
 * leetcode-13 罗马数字转整数
 * @link {https://leetcode-cn.com/problems/roman-to-integer/submissions/}
 */
public class Problem13 {

    private static Map<Character, Integer> maps = new HashMap<>();

    static {
        maps.put('I', 1);
        maps.put('V', 5);
        maps.put('X', 10);
        maps.put('L', 50);
        maps.put('C', 100);
        maps.put('D', 500);
        maps.put('M', 1000);
    }

    public int romanToInt(String s) {
        int ans = 0;
        for (int i = 0; i < s.length() - 1; i++) {
            if (maps.get(s.charAt(i)) < maps.get(s.charAt(i + 1))) {
                ans -= maps.get(s.charAt(i));
            } else {
                ans += maps.get(s.charAt(i));
            }
        }
        return ans + maps.get(s.charAt(s.length() - 1));
    }
}

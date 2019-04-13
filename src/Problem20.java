import java.util.HashMap;
import java.util.Stack;

/**
 * LeetCode-20 有效的括号
 * @link {https://leetcode-cn.com/problems/valid-parentheses/submissions/}
 */
public class Problem20 {

    private static HashMap<Character, Character> mappings = new HashMap<>();

    static {
        mappings.put('(', ')');
        mappings.put('[', ']');
        mappings.put('{', '}');
    }


    public boolean isValid(String s) {
        if (s == null || s.length() == 0) {
            return true;
        }
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if (mappings.containsKey(s.charAt(i))) {
                stack.push(s.charAt(i));
            } else {
                if (stack.isEmpty() || mappings.get(stack.pop()) != s.charAt(i)) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}

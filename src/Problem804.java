import java.util.HashSet;
import java.util.Set;

/**
 * leetcode-804 唯一摩尔斯密码词
 * @link {https://leetcode-cn.com/problems/unique-morse-code-words/}
 */
public class Problem804 {

    private static String[] MORSE = {".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..", "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--.."};

    public int uniqueMorseRepresentations(String[] words) {
        Set<String> morseSet = new HashSet<>();
        for (String word : words) {
            StringBuilder sb = new StringBuilder();
            for (char c : word.toCharArray()) {
                sb.append(MORSE[c - 'a']);
            }
            morseSet.add(sb.toString());
        }
        return morseSet.size();
    }
}

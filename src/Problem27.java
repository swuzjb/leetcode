/**
 * leetcode-27 移除元素
 * @link {https://leetcode-cn.com/problems/remove-element/comments/}
 */
public class Problem27 {
    public int removeElement(int[] nums, int val) {
        int i = 0, j = 0;
        while (j < nums.length) {
            if (nums[j] != val) {
                nums[i++] = nums[j];
            }
            j++;
        }
        return i;
    }
}

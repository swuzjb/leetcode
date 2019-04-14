/**
 * leetcode-26 删除排序数组中的重复项
 *
 * @link {https://leetcode-cn.com/problems/remove-duplicates-from-sorted-array/}
 */
public class Problem26 {

    public int removeDuplicates(int[] nums) {
        int i = 0, j = 0;
        while (j < nums.length) {
            if (nums[i] == nums[j]) {
                j++;
                continue;
            }
            nums[++i] = nums[j++];
        }
        return i;
    }
}

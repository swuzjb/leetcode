/**
 * leetcode-1 两数之和
 *
 * @link {https://leetcode-cn.com/problems/two-sum/}
 */
public class Problem1 {
    public int[] twoSum(int[] nums, int target) {
        int[] ans = new int[2];

        for (int i = 0; i < nums.length; i++) {
            int flag = target - nums[i];
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] == flag) {
                    ans[0] = i;
                    ans[1] = j;
                    return ans;
                }
            }
        }

        return new int[2];
    }
}

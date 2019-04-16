/**
 * leetcode-88 合并两个有序数组
 *
 * @link {https://leetcode-cn.com/problems/merge-sorted-array/}
 */
public class Problem88 {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int index = m + n - 1;
        m = m - 1;
        n = n - 1;
        while (n >= 0 && m >= 0) {
            nums1[index--] = nums1[m] > nums2[n] ? nums1[m--] : nums2[n--];
        }
        while (n >= 0) {
            nums1[index--] = nums2[n--];
        }
    }
}

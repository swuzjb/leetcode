/**
 * leetcode-110 平衡二叉树
 *
 * @link {https://leetcode-cn.com/problems/balanced-binary-tree/}
 */
public class Problem110 {

    private class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    // todo:待优化
    public boolean isBalanced(TreeNode root) {
        if (root == null || root.left == null && root.right == null) {
            return true;
        }
        int leftDepth = getTreeDepth(root.left);
        int rightDepth = getTreeDepth(root.right);
        if (Math.abs(leftDepth - rightDepth) > 1) {
            return false;
        }
        return isBalanced(root.left) && isBalanced(root.right);
    }

    public int getTreeDepth(TreeNode node) {
        if (node == null) {
            return 0;
        }
        return Math.max(getTreeDepth(node.left), getTreeDepth(node.right)) + 1;
    }


}

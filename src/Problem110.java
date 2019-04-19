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

    public boolean isBalanced(TreeNode root) {
        if (root == null) {
            return true;
        }
        int leftDepth = getTreeDepth(root.left);
        int rightDepth = getTreeDepth(root.right);
        if (leftDepth == -1 || rightDepth == -1) {
            return false;
        }
        return Math.abs(leftDepth - rightDepth) <= 1;
    }

    public int getTreeDepth(TreeNode node) {
        if (node == null) {
            return 0;
        }
        int leftDepth = getTreeDepth(node.left);
        int rightDepth = getTreeDepth(node.right);
        if (leftDepth == -1 || rightDepth == -1) {
            return -1;
        }
        if (Math.abs(leftDepth - rightDepth) > 1) {
            return -1;
        }
        return Math.max(leftDepth, rightDepth) + 1;
    }


}

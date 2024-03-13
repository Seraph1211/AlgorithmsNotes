import models.TreeNode;

// https://leetcode.cn/problems/invert-binary-tree/description/?envType=study-plan-v2&envId=top-interview-150
public class Question226 {
    public TreeNode invertTree(TreeNode root) {
        revert(root);   
        return root;
    }

    private void revert(TreeNode node) {
        if (node == null) {
            return;
        }

        TreeNode tempNode = node.left;
        node.left = node.right;
        node.right = tempNode;

        revert(node.left);
        revert(node.right);
    }
}

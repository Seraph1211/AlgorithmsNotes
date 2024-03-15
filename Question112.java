import models.TreeNode;

// https://leetcode.cn/problems/path-sum/?envType=study-plan-v2&envId=top-interview-150
public class Question112 {
    

    public boolean hasPathSum(TreeNode root, int targetSum) {
        return calSum(root, targetSum, 0);
    }

    private boolean calSum(TreeNode node, int tarSum, int curSum) {
        if (node == null) {
            return false;
        }

        curSum += node.val;
        if (node.left == null 
        && node.right == null 
        && curSum == tarSum) {
            return true;
        }

        return calSum(node.left, tarSum, curSum) || calSum(node.right, tarSum, curSum);
    }
}

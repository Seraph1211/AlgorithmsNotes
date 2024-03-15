import models.TreeNode;

// https://leetcode.cn/problems/convert-sorted-array-to-binary-search-tree/description/?envType=study-plan-v2&envId=top-interview-150
public class Question108 {
    public TreeNode sortedArrayToBST(int[] nums) {
        return dfs(nums, 0, nums.length - 1);
    }


    private TreeNode dfs(int[] nums, int l, int r) {
        if (l > r) {
            return null;
        }

        int m = l + (r - l) / 2;
        TreeNode node = new TreeNode(nums[m]);
        node.left = dfs(nums, l, m-1);
        node.right = dfs(nums, m + 1, r);
        return node;
    }
}

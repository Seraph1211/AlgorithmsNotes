import java.util.List;
import java.util.Queue;
import java.util.ArrayList;
import java.util.LinkedList;

// https://leetcode.cn/problems/same-tree/description/?envType=study-plan-v2&envId=top-interview-150
public class Question100 {
    
    public boolean isSameTree(TreeNode p, TreeNode q) {
        List<String> arrP = transformIntoList(p);
        List<String> arrQ = transformIntoList(q);

        if (arrP.size() != arrQ.size()) {
            return false;
        }

        for (int i = 0; i < arrP.size(); i++) {
            if (!arrP.get(i).equals(arrQ.get(i))) {
                return false;
            }
        }

        return true;
    }

    private List<String> transformIntoList(TreeNode root) {
        List<String> arr = new ArrayList<>();
        Queue<TreeNode> que = new LinkedList<>();

        que.add(root);

        while (!que.isEmpty()) {
            TreeNode node = que.poll();

            if (node == null) {
                arr.add("null");
                continue;
            }

            arr.add(String.valueOf(node.val));
            que.add(node.left);
            que.add(node.right);
        }

        return arr;
    }

    private class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
}
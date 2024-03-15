import java.util.ArrayList;
import java.util.List;

import models.TreeNode;

// https://leetcode.cn/problems/minimum-absolute-difference-in-bst/submissions/512314813/?envType=study-plan-v2&envId=top-interview-150
public class Question530 {
    
    public int getMinimumDifference(TreeNode root) {
        getMini(root);
        return min;
    }

    int min = Integer.MAX_VALUE, lastValue = Integer.MAX_VALUE;
    private void getMini(TreeNode node) {
        if (node == null) {
            return;
        }
        getMini(node.left);

        min = Math.min(min, Math.abs(lastValue - node.val));
        lastValue = node.val;
        
        getMini(node.right);
    }
}

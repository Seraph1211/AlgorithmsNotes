import java.util.ArrayList;
import java.util.List;

import models.TreeNode;

// https://leetcode.cn/problems/symmetric-tree/description/?envType=study-plan-v2&envId=top-interview-150
public class Question101 {
    
    public boolean isSymmetric(TreeNode root) {
        List<String> arrLeft = new ArrayList<>();
        List<String> arrRight = new ArrayList<>();

        convertToArrFromLeft(root, arrLeft);
        convertToArrFromRight(root, arrRight);

        for (int i = 0; i < arrLeft.size(); i++) {
            if (!arrLeft.get(i).equals(arrRight.get(i))) {
                return false;
            }
        }
        return true;
    }

    /**
     * 从左树开始，进行深度优先遍历
     * @param node
     *  @param arrLeft
     */
    private void convertToArrFromLeft(TreeNode node, List<String> arrLeft) {
        if (node == null) {
            arrLeft.add("null");
            return;
        }
        
        arrLeft.add(node.val + "");
        convertToArrFromLeft(node.left, arrLeft);
        convertToArrFromLeft(node.right, arrLeft);
    }

    /**
     * 从右树开始，进行深度优先遍历
     * @param node
     * @param arrRight
     */
    private void convertToArrFromRight(TreeNode node, List<String> arrRight) {
        if (node == null) {
            arrRight.add("null");
            return;
        }

        arrRight.add(node.val + "");
        convertToArrFromRight(node.right, arrRight);
        convertToArrFromRight(node.left, arrRight);
    }

}

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import models.TreeNode;

// https://leetcode.cn/problems/average-of-levels-in-binary-tree/description/?envType=study-plan-v2&envId=top-interview-150
public class Question637 {
    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> avgs = new ArrayList<>();
        Queue<TreeNode> mQue = new LinkedList<>();
        mQue.add(root);

        while (!mQue.isEmpty()) {
            double sum = 0;
            int size = mQue.size();
            for (int i = 0; i < size; i++) {
                TreeNode node = mQue.poll();
                if (node == null) {
                    continue;
                }

                sum += node.val;

                if (node.left != null) {
                    mQue.add(node.left);
                }
                if (node.right != null) {
                    mQue.add(node.right);
                }
            }
 
            if (size != 0) {
                avgs.add(sum / size);
            }
    }

        return avgs;
}
}

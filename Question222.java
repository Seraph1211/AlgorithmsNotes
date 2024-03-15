import models.TreeNode;

// https://leetcode.cn/problems/count-complete-tree-nodes/?envType=study-plan-v2&envId=top-interview-150
// 别tm跟年轻人讲武德
public class Question222 {
    public int countNodes(TreeNode root) {
    	if(root == null) {
    		return 0;
    	}
    	int left = countNodes(root.left);
    	int right = countNodes(root.right);
    	
    	return left+right+1;
    	
    }
}

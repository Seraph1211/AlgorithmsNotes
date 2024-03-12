import java.util.HashSet;
import java.util.Set;

// 类似「环」的问题还可以考虑「快慢指针」
// https://leetcode.cn/problems/linked-list-cycle/description/?envType=study-plan-v2&envId=top-interview-150
public class Question141 {
    public static void main(String[] args) {
        ListNode node;
    }

    public static boolean hasCycle(ListNode head) {
        if (head == null) {
            return false;
        }

        Set<ListNode> mSet = new HashSet<>();

        while (head != null) {
            if (mSet.contains(head)) {
                return true;
            }

            mSet.add(head);
            head = head.next;
        }

        return false;
    }


    private class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
            next  = null;
        } 
    }
}

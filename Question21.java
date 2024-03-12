// https://leetcode.cn/problems/merge-two-sorted-lists/description/?envType=study-plan-v2&envId=top-interview-150
public class Question21 {
    
    public static void main(String[] args) {
        
    }

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        // 先处理异常情况
        if (list1 == null && list2 == null) {
            return null;
        }
        if (list1 == null && list2 != null) {
            return list2;
        }
        if (list1 != null && list2 == null) {
            return list1;
        }

        ListNode head, p1 = list1, p2 = list2, p3;
        if (p1.val < p2.val) {
            head = p1;
            p1 = p1.next;
        } else {
            head = p2;
            p2 = p2.next;
        }
        p3 = head;

        while (p1 != null && p2 != null) {
            if (p1.val < p2.val) {
                p3.next = p1;
                p1 = p1.next;
            } else {
                p3.next = p2;
                p2 = p2.next;
            }

            p3 = p3.next;
        }

        if (p1 == null && p2 != null) {
            p3.next = p2;
        }
        if (p1 != null && p2 == null) {
            p3.next = p1;
        }

        return head;
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

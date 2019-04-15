/**
 * leetcode-21 合并两个有序链表
 *
 * @link {https://leetcode-cn.com/problems/merge-two-sorted-lists/}
 */
public class Problem21 {

    private class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode head = new ListNode(0);
        ListNode ans = head;
        while (l1 != null && l2 != null) {
            ListNode p;
            if (l1.val < l2.val) {
                p = l1;
                l1 = l1.next;
            } else {
                p = l2;
                l2 = l2.next;
            }
            head.next = p;
            head = head.next;
        }
        if(l1 != null){
            head.next = l1;
        }
        if(l2 != null){
            head.next = l2;
        }
        return ans.next;
    }
}

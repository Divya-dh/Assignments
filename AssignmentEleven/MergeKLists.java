class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        if (lists == null || lists.length == 0)return null;
        ListNode res = null;
        for (int i = 0; i < lists.length; i++) {
            res = mergeTwoLists(res, lists[i]);
        }
        return res;
    }
    private ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null) return l2;
        if (l2 == null) return l1;
        ListNode res = null, temp = null;
        if (l1.val < l2.val) {
            res = temp = l1;
            l1 = l1.next;
        } else {
            res = temp = l2;
            l2 = l2.next;
        }
        while (l1 != null && l2 != null) {
            if (l1.val < l2.val) {
                temp.next = l1;
                l1 = l1.next;
            } else {
                temp.next = l2;
                l2 = l2.next;
            }
            temp = temp.next;
        }
        if (l1 != null) temp.next = l1;
        if (l2 != null) temp.next = l2;
        return res;
    }
}

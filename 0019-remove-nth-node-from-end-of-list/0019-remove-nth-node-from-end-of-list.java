class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode one = head, two = head;
        for (int i = 0; i < n; i++) one = one.next;
        if (one == null) return head.next;
        while (one.next != null) {
            one = one.next;
            two = two.next;
        }
        two.next = two.next.next;
        return head;
    }
}
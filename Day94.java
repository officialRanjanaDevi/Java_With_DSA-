public class Day94 {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int carry = 0;
        ListNode prev = new ListNode(-1);
        prev.next = new ListNode(-1);
        ListNode curr = prev.next;
        while (l1 != null && l2 != null) {
            int currentRes = l1.val + l2.val + carry;
            int num = currentRes % 10;
            carry = (int) currentRes / 10;
            curr.val = num;
            curr.next = new ListNode(-1);
            curr = curr.next;
            l1 = l1.next;
            l2 = l2.next;
        }
        if (l1 == null) {
            while (l2 != null) {
                int currentRes = l2.val + carry;
                int num = currentRes % 10;
                carry = (int) currentRes / 10;
                curr.val = num;
                curr.next = new ListNode(-1);
                curr = curr.next;
                l2 = l2.next;
            }
        } else {
            while (l1 != null) {
                int currentRes = l1.val + carry;
                int num = currentRes % 10;
                carry = (int) currentRes / 10;
                curr.val = num;
                curr.next = new ListNode(-1);
                curr = curr.next;
                l1 = l1.next;
            }
        }
        if (carry > 0) {
            curr.val = carry;
            curr.next = new ListNode(-1);
            curr = curr.next;
        }
        ListNode temp = prev.next;
        while (temp.next.next != null) {
            temp = temp.next;
        }
        temp.next = null;
        return prev.next;
    }
}

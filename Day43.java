public class Day43 {
        public void reorderList(ListNode head) {
            // divide linked list-----
            ListNode slow=head;
            ListNode fast=head.next;
            while(fast!=null&&fast.next!=null){
               slow=slow.next;
               fast=fast.next.next;
            }
            ListNode head2=slow.next;
            slow.next=null;
    
            // reverse 2nd half 
    
            ListNode curr=head2;
            ListNode prev=null;
            ListNode next;
            while(curr!=null){
                next=curr.next;
                curr.next=prev;
                prev=curr;
                curr=next;
            }
            head2=prev;
            //merge both linked list
    
            ListNode left=head;
            ListNode right=head2;
            ListNode leftnext,rightnext;
            while(left!=null&&right!=null){
                leftnext=left.next;
                left.next=right;
                rightnext=right.next;
                right.next=leftnext;
    
                left=leftnext;
                right=rightnext;
            }
        }
}

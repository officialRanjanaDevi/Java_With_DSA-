public class Day88 {
        public ListNode reverse(ListNode head){
            if(head==null ||head.next==null){
                return head;
            }
            ListNode curr =head;
            ListNode prev=null;
            ListNode next;
            while(curr!=null){
                next=curr.next;
                curr.next=prev;
                prev=curr;
                curr=next;
            }
            return prev;
        }
        public ListNode doubleIt(ListNode head) {
            head=reverse(head);
            ListNode temp=head;
            int carry=0;
            ListNode pre=head;
            while(temp!=null){
                int num=temp.val*2+carry;
                carry=num/10;
                num=num%10;
                temp.val=num;
                pre=temp;
                temp=temp.next;
            }
            while(carry!=0){
                int num=carry%10;
                carry=carry/10;
                ListNode newnode=new ListNode(num);
                pre.next=newnode;
                pre=pre.next;
            }
            return reverse(head);
        }
}

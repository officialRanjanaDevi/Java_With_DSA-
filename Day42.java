import java.util.Stack;
public class Day42 {
    public boolean isPalindrome(ListNode head) {
        if(head==null||head.next==null){
            return true;
        }
        ListNode slow=head;
        ListNode fast=head;
        Stack<Integer> st=new Stack<>();
        while(fast!=null && fast.next!=null){
            st.push(slow.val);
            slow=slow.next;
            fast=fast.next.next;
        }
        if(fast!=null){
           slow=slow.next; 
        }
        while(slow!=null){
            if(st.pop()!=slow.val){
                return false;
            }
            slow=slow.next;
        }
        return true;
    }
}

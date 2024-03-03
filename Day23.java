// Remove nth Node from Last-----------------
 class ListNode {
        int val;
         ListNode next;
         ListNode() {}
         ListNode(int val) { this.val = val; }
         ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 }
class Day23 {
    // method to calculate size of linked list
    public static int calsize(ListNode head){
        int count=0;
        while(head!=null){
             head=head.next;
             count++;
        }
        return count;
    }
    // function to remove nth node from last
    public static ListNode removeNthFromEnd(ListNode head, int n) {
        int size=calsize(head);
        if(size==1&&n==1){
            head=null;
            return head;
        }
        ListNode temp=head;
        
        int count=0;
        while(temp!=null){
            if(count==size-n){
                head=head.next;
                return head;
            }
            if(count==size-n-1){
               ListNode del=temp.next;
        temp.next=temp.next.next;
        del.next=null;
        return head;  
            }else{
                 temp=temp.next;
            count++;
            }
        }
        return head;
    }
    // drive code
    public static void main(String[]args){
        ListNode head=new ListNode(10);
        ListNode temp1=new ListNode(15);
        head.next=temp1;
        ListNode temp2=new ListNode(65);
        temp1.next=temp2;
        ListNode temp3=new ListNode(5);
        temp2.next=temp3;
        //printing the final linked list
        head=removeNthFromEnd(head,3);
        while(head!=null){
            System.out.print(head.val+" ");
            head=head.next;
        }    
    } 
}
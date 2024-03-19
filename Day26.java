
public class Day26 {
    public static void print(Node head){
        if(head==null){
            System.out.println("List is empty");
            return;
        }
        while(head!=null){
            System.out.print(head.data+" -> ");
            head=head.next;
        }
        System.out.print("null");
        System.out.println();
    }

    public static Node delete_head(Node head){
        if(head==null|| head.next==null){
            return null;
        }
        head=head.next;
        return head;
    }

    public static Node delete_last(Node head){
        if(head==null || head.next==null){
            return null;
        }
        Node temp =head;
        while(temp.next.next!=null){
            temp=temp.next;
        }
        temp.next=null;
        return head;
    }
    
    public static Node delete_k_idx(Node head ,int k){
        if(head==null){
            return null;
        }
        if(k==1){
            return delete_head(head);
        }
        Node temp=head;
        int count=1;
        while(temp.next!=null){
            if(count==k-1){
                 temp.next=temp.next.next;
                 return head;
            }
            temp=temp.next;
            count++;
        }
        return head;
    }
    public static Node delete_val(Node head, int val){
        if(head==null){
            System.out.println("ll is empty");
            return null;
        }
        if(head.data==val){
            head=head.next;
            return head;
        }
        Node temp=head;
        while(temp!=null){
             if(temp.next.data==val){
                temp.next=temp.next.next;
                return head;
             }
             temp=temp.next;     
        }
        return head;
    }
    public static void main(String []args){
        Node head=new Node(10);
        Node n1=new Node(15);
        head.next=n1;
        Node n2=new Node(30);
        n1.next=n2;
        Node n3=new Node(50);
        n2.next=n3;
        Node n4=new Node(80);
        n3.next=n4;
       
        print(head);
        head=delete_head(head);
        print(head);
        head=delete_last(head);
        print(head);
        print(delete_k_idx(head, 5));
        print(delete_val(head, 30));

    }
}
class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        this.next=null;
    }
}
class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        this.next=null;
    }
    Node (int data,Node next){
        this.data=data;
        this.next=next;
    }
}
public class Day25 {
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
    
    public static Node insert_at_head(Node head,int data){
            Node newnode= new Node(data);
            newnode.next=head;
            head=newnode;
            return head;
    }
    
    public static Node insert_at_idx(Node head,int data,int k){
        if(head==null&&k==1){
            return new Node(data);
        }
        if(k==1){
            return insert_at_head(head, data);
        }
        Node temp=head;
        int count=1;
        while(temp!=null){
            if(count==k-1){
                Node newnode=new Node(data);
                newnode.next=temp.next;
                temp.next=newnode;
                return head;
            }else{
                count++;
                temp=temp.next;
            }
        }
        return head;
    }
    public static Node insert_at_val(Node head,int data,int val){
        if(head==null){
            System.out.println("Not possible");
        }
        Node temp=head;
        while(temp!=null){
            if(temp.data==val){
                Node newnode =new Node(data);
                newnode.next=temp.next;
                temp.next=newnode;
                return head;
            }else{
                temp=temp.next;
            }
        }
        return head;
    }
    public static void main(String[]args){
        Node head=new Node(5);
        Node n2=new Node(7);
        head.next=n2;
        Node n3=new Node(10);
        n2.next=n3;
        print(head);
        head=insert_at_idx(head,87,3);
        print(head);
        print(insert_at_val(head,55,7));
        
    }
   
}


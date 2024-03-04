// Insert at head and last index of a linked list
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
public class Day24 {
    public static Node insert_at_head(Node head,int data){
            Node newnode= new Node(data);
            newnode.next=head;
            head=newnode;
            return head;
    }
    public static Node insert_at_last(Node head,int data){
        Node temp=head;
        Node newNode=new Node(data);
        if(head==null){
            return newNode;
        }
        while(temp.next!=null){
           temp= temp.next;
        }
        temp.next=newNode;
        return head;
    }
    public static void print(Node head){
        Node temp=head;
        System.out.print("head->");
        while(temp!=null){
            System.out.print(temp.data+" -> ");
            temp=temp.next;
        }
        System.out.println("null");
    }
    public static void main(String[]args){
        Node head=new Node(5);
        Node n2=new Node(7);
        head.next=n2;
        Node n3=new Node(10);
        n2.next=n3;
        print(head);
        head=insert_at_head(head,19);
        print(head);
        print(insert_at_last(head,15));
        
    }
}

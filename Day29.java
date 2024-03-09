// Convert Array into Doubly Linked List
class Node{
    int data;
    Node next;
    Node prev;
    Node (int data){
        this.data=data;
        this.next=null;
        this.prev=null;
    }
}
public class Day29 {
    public static void print(Node head){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" <-> ");
            temp=temp.next;
        }
        System.out.println("null");
    }
    public static void main(String[]args){
        int arr[]={10,20,30,40,50,60};
        Node head=new Node(arr[0]);
        Node prev=head;
        for(int i=1;i<arr.length;i++){
            Node newnode=new Node(arr[i]);
            prev.next=newnode;
            newnode.prev=prev;
            prev=newnode;
        }
        print(head);
    }
}

public class Day36 {
        static class Node{
            int data;
            Node left;
            Node right;
            Node(int data){
                this.data=data;
                this.left=null;
                this.right=null;
            }
        }
        static Node root;
        static void postorder(Node root){
            if(root==null){
                return;
            }
             postorder(root.left);
             postorder(root.right);
             System.out.print(root.data+"  ");
        }
        public static void main(String[]args){
            root =new Node(10);
            root.left=new Node(9);
            root.left.left=new Node(8);
            root.left.left.left=new Node(7);
            root.left.right=new Node(6);
            root.right= new Node(4);
            root.right.left=new Node(3);
            root.right.left.right=new Node(5);
            root.right.right=new Node(2);
        
            postorder(root);
        } 
}
    


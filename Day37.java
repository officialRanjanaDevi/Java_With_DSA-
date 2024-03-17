public class Day37 {
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
        public static void preorder(Node root){
            if(root==null){
                return;
            }
            System.out.print(root.data+"  ");
            preorder(root.left);
            preorder(root.right);
        }
        public static void main(String[]args){
           root=new Node(10);
           root.left=new Node(3);
           root.right=new Node(9);
           root.left.left=new Node(67);
           root.right.left=new Node(12);
           root.right.right=new Node(5);
           preorder(root);
        } 
}

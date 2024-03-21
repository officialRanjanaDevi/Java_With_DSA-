public class Day40 {
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
         static int sum=0; 
         static Node root;
         public static int sum(Node root){
             if(root==null){
                 return 0;
             }
             int leftsum=sum(root.left);
             int rightsum=sum(root.right);
             return leftsum+rightsum+root.data;
         }
         public static void main(String []args){
             root=new Node(10);
             root.left=new Node(30);
             root.right=new Node(20);
             root.left.left=new Node(30);
             root.right.left=new Node(10);
             // root.right.right=new Node(50);
             System.out.println(sum(root));
         }
}

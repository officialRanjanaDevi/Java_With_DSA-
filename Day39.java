public class Day39 {
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
        public static int countNoOfNodes(Node root){
            if(root==null){
                return 0;
            }
            int leftnodes=countNoOfNodes(root.left);
            int rightnodes=countNoOfNodes(root.right);
            return leftnodes+rightnodes+1;
        }
        public static void main(String[]args){
           root=new Node(10);
           root.left=new Node(3);
           root.right=new Node(9);
           root.left.left=new Node(67);
           root.right.left=new Node(12);
           System.out.println(countNoOfNodes(root));
        }    
}

class Day67 {
    private void addRow(TreeNode root,int val,int depth,int count){
        if(root==null){
            return;
        }
        if(count==depth-1){
            TreeNode leftnode=new TreeNode(val);
             TreeNode rightnode=new TreeNode(val);

             leftnode.left=root.left;
             rightnode.right=root.right;

             root.left=leftnode;
             root.right=rightnode;
        }else{
            addRow(root.left,val,depth,count+1);
            addRow(root.right,val,depth,count+1);
        }
    }
    public TreeNode addOneRow(TreeNode root, int val, int depth) {
        if(depth==1){
            TreeNode node=new TreeNode(val);
            node.left=root;
            return node;
        }
        addRow(root,val,depth,1);
        return root;
    }
}
public class Day68 {
    String smallest= "";
    public String smallestFromLeaf(TreeNode root) {
        helper(root,"");
        return smallest;
    }
    void helper(TreeNode root,String curr){
        if(root==null){
            return;
        }
        curr=(char)(root.val+'a')+curr;
        if(root.left==null &&root.right==null){
            if(smallest.isEmpty()||smallest.compareTo(curr)>0){
                smallest=curr;
            }
        }
        if(root.left!=null){
            helper(root.left,curr);
        }
         if(root.right!=null){
            helper(root.right,curr);
        }
    }
}

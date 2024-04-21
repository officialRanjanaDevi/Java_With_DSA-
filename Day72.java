public class Day72 {
        public boolean symmetric(TreeNode lroot,TreeNode rroot){
            if(lroot==null || rroot==null){
                return lroot==rroot;
            }
            if(lroot.val!=rroot.val){
                return false;
            }
            return symmetric(lroot.left,rroot.right)&&symmetric(lroot.right,rroot.left);
        }
        public boolean isSymmetric(TreeNode root) {
            if(root==null){
                return true;
    
            }
            return symmetric(root.left,root.right);
        }
}

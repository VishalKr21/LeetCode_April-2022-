class Solution {
    int sum = 0;
    void fun(TreeNode root)
    {
        if(root==null)return;
        
        if(root.right!=null)
            fun(root.right);
        sum += root.val;
            root.val = sum;
        
        if(root.left!=null)
            fun(root.left);
         
        
    }
    public TreeNode convertBST(TreeNode root) {
        fun(root);
        return root;
    }
}
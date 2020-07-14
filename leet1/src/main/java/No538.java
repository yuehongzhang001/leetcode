/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author yuehongzhang
 */
public class No538 {
    TreeNode latter = null;
    public TreeNode convertBST(TreeNode root) {
        helper(root);
        return root;
    }
    public void helper(TreeNode root){
        if(root==null) return;
        helper(root.right);
        if(latter!=null)
            root.val += latter.val;
        latter = root;
        helper(root.left);
    }
}

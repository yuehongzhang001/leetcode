/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author yuehongzhang
 */
public class No897 {
    
    TreeNode res=new TreeNode(-1);
    TreeNode prev=res;
    public TreeNode increasingBST(TreeNode root) {
         go(root);
         return res.right;
    }
    public void go(TreeNode root){
        if(root==null)
            return;
        go(root.left);
        root.left=null;
        prev.right=root;
        prev=root;
        go(root.right);
    }
}

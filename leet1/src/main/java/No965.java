/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author yuehongzhang
 */
public class No965 {
    public boolean isUnivalTree(TreeNode root) {
        return helper(root,root.val);
    }
    public boolean helper(TreeNode root,int val){
        if(root==null) return true;
        return root.val==val && helper(root.left,val) && helper(root.right,val);
    }
     public boolean isUnivalTree1(TreeNode root){
         boolean left=(root.left==null||root.val==root.left.val && isUnivalTree1(root.left));
         boolean right=(root.right==null||root.val==root.right.val && isUnivalTree1(root.right));
         return left && right;
     }
}

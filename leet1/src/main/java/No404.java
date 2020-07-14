/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author yuehongzhang
 */
public class No404 {
    public int sumOfLeftLeaves(TreeNode root) {
        if(root==null) return 0;
        return sumLeft(root.left)+sumRight(root.right);
    }
    public int sumLeft(TreeNode root){
        if(root==null) return 0;
        if(root.left==null && root.right==null) return root.val;
        return sumLeft(root.left)+sumRight(root.right);
    }
    public int sumRight(TreeNode root){
        if(root==null) return 0;
        if(root.left==null && root.right==null) return 0;
        return sumLeft(root.left)+sumRight(root.right);
    }
    
    public int sumOfLeftLeaves1(TreeNode root){
        return sumOfLeftLeaves(root,false);
    }
    public int sumOfLeftLeaves(TreeNode root, boolean flag){
        if(root==null) return 0;
        if(flag && root.left==null && root.right==null)
            return root.val;
        return sumOfLeftLeaves(root.left,true)+sumOfLeftLeaves(root.right,false);
    }
}

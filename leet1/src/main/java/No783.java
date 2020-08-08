/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author yuehongzhang
 */
public class No783 {
    Integer pre=null;
    int min=Integer.MAX_VALUE;
    public int minDiffInBST(TreeNode root) {
        go(root);
        return min;
    }
    public void go(TreeNode root){
        if(root==null) return;
        go(root.left);
        if(pre!=null)
            min=Math.min(min, root.val-pre);
        pre=root.val;
        go(root.right);
    }
    
}

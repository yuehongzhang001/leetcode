/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author yuehongzhang
 */
public class No111 {
    public int minDepth(TreeNode root) {
        if(root==null) return 0;
        if(root.left==null && root.right==null) return 1;
        if(root.left==null) return 1+helpler(root.right);
        if(root.right==null) return 1+helpler(root.left);
        return Math.min(helpler(root.left), helpler(root.right))+1;
    }
    public int helpler(TreeNode root){
        if(root==null) return 0;
        return 1+Math.min(minDepth(root.left), minDepth(root.right)); 
    }
}

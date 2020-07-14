/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author yuehongzhang
 */
public class No543 {
    int res = 0;
    public int diameterOfBinaryTree(TreeNode root) {
        depth(root);
        return res;
    }
    public int depth(TreeNode root){
        if(root==null) return 0;
        int L = depth(root.left);
        int R = depth(root.right);
        res = Math.max(L+R, res);
        return Math.max(L, R)+1;
    }
}

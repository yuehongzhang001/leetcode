/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author yuehongzhang
 */
public class S27 {
    public TreeNode mirrorTree(TreeNode root) {
        if(root==null) return null;
        TreeNode tmp = root.left;
        root.left=mirrorTree(root.right);
        root.right=mirrorTree(tmp);
        return root;
    }
}

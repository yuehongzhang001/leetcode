/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author yuehongzhang
 */
public class No669 {
    public TreeNode trimBST(TreeNode root, int L, int R) {
        if(root==null) return null;
        if(root.val>=L && root.val<=R){
            root.left=trimBST(root.left,L,R);
            root.right=trimBST(root.right,L,R);
            return root;
        }
        else if(root.val<L)
            return trimBST(root.right,L,R);
        else
            return trimBST(root.left,L,R);
    }
}

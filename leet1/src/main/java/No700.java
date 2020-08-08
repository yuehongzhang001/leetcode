/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author yuehongzhang
 */
public class No700 {
    public TreeNode searchBST(TreeNode root, int val) {
        if(root==null) return null;
        if(root.val==val) return root;
        if(root.val<val) return searchBST(root.right,val);
        return searchBST(root.left,val);
    }
    public TreeNode searchBST1(TreeNode root, int val){
        TreeNode p = root;
        while(p!=null){
            if(p.val==val)
                return p;
            else if(p.val<val)
                p=p.right;
            else
                p=p.left;
        }
        return p;
    }
}

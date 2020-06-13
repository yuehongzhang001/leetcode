/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author yuehongzhang
 */
public class No100 {
     public static boolean isSameTree(TreeNode p, TreeNode q) {
         if(p==null||q==null) return p==q;
         if(p.val!=q.val) return false;
         return isSameTree(p.left,q.left) && isSameTree(p.right,q.right);
    }
}

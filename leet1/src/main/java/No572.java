/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author yuehongzhang
 */
public class No572 {
    public boolean isSubtree(TreeNode s, TreeNode t) {
        if(equalTree(s,t)) return true;
        if(s==null) return false;
        return isSubtree(s.left,t) || isSubtree(s.right,t);
    }
   
    
    public boolean isSubtree1(TreeNode s, TreeNode t){
        if(s==null && t==null) return true;
        if(s==null || t==null) return false;
        if(s.val==t.val && equalTree(s.left,t.left) && equalTree(s.right,t.right))
            return true;      
        return isSubtree(s.left, t) || isSubtree(s.right,t);
    }
    
     public boolean equalTree(TreeNode r1, TreeNode r2){
        if(r1==null && r2==null) return true;
        if(r1==null || r2==null) return false;
        if(r1.val!=r2.val)
            return false;
        return equalTree(r1.left,r2.left) && equalTree(r1.right,r2.right);
    }
}

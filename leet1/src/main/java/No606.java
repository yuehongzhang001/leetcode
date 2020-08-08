/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author yuehongzhang
 */
public class No606 {
    public String tree2str(TreeNode t) {
        if(t==null) return "";
        if(t.left==null && t.right==null) return String.valueOf(t.val);
        if(t.left==null) return t.val+"()"+"("+tree2str(t.right)+")";
        if(t.right==null) return t.val+"("+tree2str(t.left)+")";
        return t.val+"("+tree2str(t.left)+")"+"("+tree2str(t.right)+")";
    }
    
}

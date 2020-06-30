/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author yuehongzhang
 */

import javafx.util.Pair;
public class No110 {
    
    public boolean isBalanced(TreeNode root) {
        if(root==null) return true;
        if(compare(root.left,root.right))
            return isBalanced(root.left) && isBalanced(root.right);
        return false;
    }
    
    public int depth(TreeNode root){
        if(root==null) return 0;
        return 1+Math.max(depth(root.left), depth(root.right));
    }
    
    public boolean compare(TreeNode t1, TreeNode t2){
        return Math.abs(depth(t1)-depth(t2))<2;
    }
    
    public Pair<Integer,Boolean> infoHelpler(TreeNode root){
        if(root==null) return new Pair(0,true);
        if(!infoHelpler(root.left).getValue())
            return new Pair(0,false);
        if(!infoHelpler(root.right).getValue())
            return new Pair(0,false);
        int leftDepth = infoHelpler(root.left).getKey();
        int rightDepth = infoHelpler(root.right).getKey();
        if(Math.abs(leftDepth-rightDepth)<2){
            return new Pair(1+Math.max(leftDepth, leftDepth),true);
        }
        return new Pair(0,false);
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author yuehongzhang
 */
import java.util.*;
public class No687 {
    int max = 0;
    public int longestUnivaluePath(TreeNode root) {
        go(root);
        return max;
    }
    
    public void go(TreeNode root){
        if(root==null) return;
        max=Math.max(max, depthOfN(root.left,root.val)+depthOfN(root.right,root.val));
        go(root.left);
        go(root.right);
    }
    public int depthOfN(TreeNode root,int n){
        if(root==null || root.val!=n) return 0;
        return Math.max(depthOfN(root.left,n), depthOfN(root.right,n))+1;
    }
    public int arrowLength(TreeNode root){
        if(root==null) return 0;
        int left = arrowLength(root.left);
        int right = arrowLength(root.right);
        int aleft = 0;
        int aRight = 0;
        if(root.left!=null && root.val==root.left.val)
            aleft=left+1;
        if(root.right!=null && root.val==root.right.val)
            aRight=right+1;
        max=Math.max(max, aleft+aRight);
        return Math.max(aleft, aRight);
    }
}

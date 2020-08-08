/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author yuehongzhang
 */
public class No938 {
    int sum=0;
    public int rangeSumBST(TreeNode root, int L, int R) {
        go(root,L,R);
        return sum;
    }
    public void go(TreeNode root,int L,int R){
        if(root==null) return;
        if(root.val>=L && root.val<=R){
            sum+=root.val;
            go(root.left,L,R);
            go(root.right,L,R);
        }
            
        else if(root.val<L)
            go(root.right,L,R);
        else
            go(root.left,L,R);
            
    }
}

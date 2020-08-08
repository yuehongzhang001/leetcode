/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author yuehongzhang
 */

public class No1022 {
    int sum=0;
    public int sumRootToLeaf(TreeNode root) {
        go(root,0);
        return sum;
    }
    public void go(TreeNode root,int pSum){
        if(root==null) return;
        int tmp = pSum*2+root.val;
        if(root.left==null && root.right==null){
            sum+=tmp;
        }
        go(root.left,tmp);
        go(root.right,tmp);
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author yuehongzhang
 */
public class No563 {
    int res = 0;
    public int findTilt(TreeNode root) {
        sum(root);
        return res;
    }
    
    public int sum(TreeNode root){
        if(root==null)
            return 0;
        int L = sum(root.left);
        int R = sum(root.right);
        res+=Math.abs(L-R);
        return L+R+root.val;
    }
}

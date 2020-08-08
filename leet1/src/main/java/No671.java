/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author yuehongzhang
 */
public class No671 {
    Integer min1=Integer.MAX_VALUE;
    Integer min2=null;
    public int findSecondMinimumValue(TreeNode root) {
        go(root);
        return min2==null?-1:min2;
    }
    public void go(TreeNode root){
        if(root==null) return;
        if(root.val<min1){
            min2=min1;
            min1=root.val;
        }else if(root.val>min1 && (min2==null || root.val<min2)){
            min2=root.val;
        }
        go(root.left);
        go(root.right);
    }
}

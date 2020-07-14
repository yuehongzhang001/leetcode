/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author yuehongzhang
 */
public class No530 {

     public int getMinimumDifference(TreeNode root) {
         return Min(root,null,null);
    }
    public int Min(TreeNode root, Integer low,Integer high){
        if(root.left==null && root.right==null){
            if(low!=null && high!=null)
                return Math.min(root.val-low, high-root.val);
            if(high==null)
                return root.val-low;
            if(low==null)
                return high-root.val;
        }
        if(root.left==null) {
            if(low!=null){
                return Math.min(root.val-low, Min(root.right,root.val,high));
            }else{
                return Min(root.right,root.val,high);
            }
        }
            
        if(root.right==null){
            if(high!=null){
                return Math.min(Min(root.left,low,root.val),high-root.val);
            }else{
                return Min(root.left,low,root.val);
            }
        }
        return Math.min(Min(root.left,low,root.val),Min(root.right,root.val,high));
    }
    
     public int getMinimumDifference1(TreeNode root){
         return MinNum(root,null,null);
     }
    public int MinNum(TreeNode root, TreeNode low,TreeNode high){
        if(root.left==null && root.right==null){
            if(low==null)
                return high.val-root.val;
            if(high==null)
                return root.val-low.val;
            return Math.min(high.val-root.val, root.val-low.val);
        }
        if(root.left==null){
            if(low==null)
                return MinNum(root.right, root,high);
            return Math.min(root.val-low.val, MinNum(root.right, root,high));
        }
        if(root.right==null){
            if(high==null)
                return MinNum(root.left,low,root);
            return Math.min(high.val-root.val, MinNum(root.left,low,root));
        }
        return Math.min(MinNum(root.left,low,root), MinNum(root.right,root,high));
    }
    TreeNode pre;
    int minRes = Integer.MAX_VALUE;
    public int getMinimumDifference2(TreeNode root){
        pre = root.left;
        pre(root);
        return minRes;
    }
    public void pre(TreeNode root){
        if(root==null){
            return;
        }
        pre(root.left);
        if(pre!=null)
            minRes = Math.min(minRes, root.val-pre.val);
        pre=root;
        pre(root.right);
    }
}

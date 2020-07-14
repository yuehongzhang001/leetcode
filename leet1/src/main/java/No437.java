/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author yuehongzhang
 */
public class No437 {
    public int pathSum(TreeNode root, int sum) {
        if(root==null) return 0;
        return countDown(root,sum)+pathSum(root.left,sum)+pathSum(root.right,sum);
    }
    
    public int countDown(TreeNode root, int sum) {
        if(root==null) return 0;
        int count=0;
        if(root.val==sum)
            count++;
        return count+countDown(root.left,sum-root.val)+countDown(root.right,sum-root.val);
    }
}

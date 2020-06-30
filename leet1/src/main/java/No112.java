/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author yuehongzhang
 */
import java.util.LinkedList;
import java.util.Stack;
public class No112 {
 
    public boolean hasPathSum(TreeNode root, int sum) {
        if(root==null) return false;
        if(root.left==null && root.right==null)
            return sum==root.val;
        if(root.right==null)
            return hasPathSum(root.left,sum-root.val);
        if(root.left==null)
            return hasPathSum(root.right,sum-root.val);
        return hasPathSum(root.left,sum-root.val)||hasPathSum(root.right,sum-root.val);
    }
    public boolean hasPathSum1(TreeNode root, int sum){
        if(root==null) return false;
        
        LinkedList<TreeNode> nodeStack = new LinkedList();
        LinkedList<Integer> numStack = new LinkedList();
        nodeStack.push(root);
        numStack.push(root.val);
        while(!nodeStack.isEmpty()){
            TreeNode currentNode=nodeStack.pollLast();
            int currentSum=currentNode.val;
            if(currentNode.left==null && currentNode.right==null && currentSum==0)
                return true;
            if(currentNode.left==null){
                nodeStack.push(currentNode.right);
                numStack.push(sum-currentSum);
            }
            if(currentNode.right==null){
                nodeStack.push(currentNode.left);
                numStack.push(sum-currentSum);
            }
        }
        return false;
        
    }
    
    
    
}

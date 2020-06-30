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
public class No226 {
    public TreeNode invertTree(TreeNode root) {
        if(root==null) return null;
        TreeNode right = invertTree(root.left);
        TreeNode left = invertTree(root.right);
        root.left=left;
        root.right=right;
        return root;
    }
    public TreeNode invertTree1(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList();
        queue.add(root);
        while(!queue.isEmpty()){
            TreeNode current = queue.poll();
            TreeNode temp = current.left;
            current.left = current.right;
            current.right = temp;
            if( current.left != null) queue.add(current.left);
            if(current.right != null)  queue.add(current.right);
        }
        return root;
    }
}

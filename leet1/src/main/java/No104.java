/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author yuehongzhang
 */
import java.util.Queue;
import java.util.LinkedList;
import javafx.util.Pair;
public class No104 {
     public int maxDepth(TreeNode root) {
        if(root==null) return 0;
        return 1+Math.max(maxDepth(root.left), maxDepth(root.right));
    }
    public int maxDepth1(TreeNode root) {
        Queue<Pair<TreeNode,Integer>> stack = new LinkedList();
        if(root!=null) 
            stack.add(new Pair(root,1));
        int depth=0;
        while(!stack.isEmpty()){
           Pair<TreeNode,Integer> current = stack.poll();
           root = current.getKey();
           if(root!=null){
               depth=Math.max(depth, current.getValue());
               stack.add(new Pair(root,depth+1));
               stack.add(new Pair(root,depth+1));
           }
        }
        return depth;
        
    }
}

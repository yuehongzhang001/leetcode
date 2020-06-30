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
import java.util.List;
import java.util.Queue;
public class No107 {
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        LinkedList<List<Integer>> result = new LinkedList();
        Queue<TreeNode> nextLevel=new LinkedList();
        nextLevel.add(root);
        while(!nextLevel.isEmpty()){
            Queue<TreeNode> currentLevel=nextLevel;
            nextLevel=new LinkedList();
            List<Integer> currentLevelInt = new LinkedList();
            result.addFirst(currentLevelInt);
            while(!currentLevel.isEmpty()){
                root = currentLevel.poll();
                currentLevelInt.add(root.val);
                if(root.left!=null) nextLevel.offer(root.left);
                if(root.right!=null) nextLevel.offer(root.right);
            }
        }
        return result;
        
    }
    
}

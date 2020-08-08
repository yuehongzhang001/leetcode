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
public class No872 {
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        ArrayList<Integer> list1 = new ArrayList();
        ArrayList<Integer> list2 = new ArrayList();
        findLeaf(root1,list1);
        findLeaf(root2,list2);
        return list1.equals(list2);
    }
    public void findLeaf(TreeNode root,ArrayList list){
        if(root==null) return;
        if(root.left==null &&root.right==null)
            list.add(root.val);
        findLeaf(root.left,list);
        findLeaf(root.right,list);
    }
}

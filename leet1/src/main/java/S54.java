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
public class S54 {
    ArrayList<Integer> list = new ArrayList();
    public int kthLargest(TreeNode root, int k) {
        go(root);
        return list.get(list.size()-k);
    }
    
    public void go(TreeNode root){
        if(root==null) return;
        go(root.left);
        list.add(root.val);
        go(root.right);
    }
}

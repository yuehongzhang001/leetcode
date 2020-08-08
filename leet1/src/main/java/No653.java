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
public class No653 {
    HashSet<Integer> set = new HashSet();
    public boolean findTarget(TreeNode root, int k) {
        for(Integer n:set){
            if(set.contains(k-n))
                return true;
        }
        return false;
        
    }
    public void go(TreeNode root){
        if(root==null) return;
        set.add(root.val);
        go(root.left);
        go(root.right);
    }
    
    
     public boolean findTarget1(TreeNode root, int k){
         ArrayList<Integer> list = new ArrayList();
         inOrder(root,list);
         int l=list.get(0);
         int r=list.get(list.size()-1);
         while(l<r){
             if(l+r==k)
                 return true;
             else if(l+r<k)
                 l++;
             else
                 r--;
         }
         return false;
     }
     
     public void inOrder(TreeNode root, ArrayList<Integer> list){
         if(root==null) return;
         inOrder(root.left,list);
         list.add(root.val);
         inOrder(root.right,list);
     }
}

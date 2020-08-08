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
public class No993 {
    TreeNode father = null;
    public boolean isCousins(TreeNode root, int x, int y) {
        int d1 = findFather(root,x);
        TreeNode f1=father;
        int d2 = findFather(root,y);
        TreeNode f2=father;
        return d1==d2 && f1!=f2;
            
    }
    public int findFather(TreeNode root,int v){
        if(root==null) return 100;
        if(root.left!=null && root.left.val==v 
                ||root.right!=null && root.right.val==v){
            father=root;
            return 1;
        }
        return Math.min(findFather(root.left,v)+1, findFather(root.right,v)+1);
    }
    
    HashMap<Integer,Integer> depthMap;
    HashMap<Integer,TreeNode> fatherMap;
    public boolean isCousins1(TreeNode root, int x, int y){
        depthMap=new HashMap();
        fatherMap=new HashMap();
        if(root==null) return false;
        depthMap.put(root.val, 1);
        dfs(root.left,root);
        dfs(root.right,root);
        return depthMap.get(x)==depthMap.get(y) && fatherMap.get(x)!=fatherMap.get(y);
    }
    
    public void dfs(TreeNode root,TreeNode father){
        if(root==null) return;
        fatherMap.put(root.val, father);
        depthMap.put(root.val, depthMap.get(father.val)+1);
        dfs(root.left,root);
        dfs(root.right,root);
    }
    
}

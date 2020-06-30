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
public class No257 {
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> list = new LinkedList();
        if(root==null) return list;
        list.addAll(binaryTreePaths(root.left));
        list.addAll(binaryTreePaths(root.right));
        if(list.isEmpty()) 
            list.add(""+root.val);
        else{
            for(int i=0;i<list.size();i++){
                String s = list.get(i);
                list.set(i, root.val+"->"+s);
            }
        }
        return list;
        
    }
    
    public List<String> binaryTreePaths1(TreeNode root){
        List<String> list = new ArrayList();
        constructPath(root, "",list);
        return list;
    }
    
    public void constructPath(TreeNode root,String path,List<String> list){
        if(root!=null){
            path += root.val;
            if(root.left==null && root.right==null)
                list.add(path);
            else{
                path += "->";
                constructPath(root.left, path,list);
                constructPath(root.right,path,list);
            }
        }
    }
    
    public List<String> binaryTreePaths2(TreeNode root){
        List<String> list = new LinkedList();
        Stack<String> sStack = new Stack();
        if(root==null) return list;
        Stack<TreeNode> tStack = new Stack();
        tStack.add(root);
        sStack.add(String.valueOf(root.val));
        while(!tStack.isEmpty()){
            TreeNode current = tStack.pop();
            String path = sStack.pop();
            if(current.left!=null){
                tStack.push(current.left);
                sStack.push(path+"->"+current.left.val);
            }
            if(current.right!=null){
                tStack.push(current.right);
                sStack.push(path+"->"+current.right.val);
            }
            if(current.left==null&&current.right==null){
                list.add(path);
            } 
        }
        return list;
    }
}

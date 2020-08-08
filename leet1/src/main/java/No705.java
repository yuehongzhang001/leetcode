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
public class No705{
public class MyHashSet {
    private Bucket[] bucketArray;
    private int range;
    public MyHashSet() {
        range = 769;
        bucketArray=new Bucket[range];
        for(Bucket b:bucketArray){
            b=new Bucket();
        }
    }
    private int hash(int key){
        return key % range;
    }
    
    public void add(int key) {
        int index=hash(key);
        bucketArray[index].insert(key);
    }
    
    public void remove(int key) {
        int index=hash(key);
        bucketArray[index].delete(key);
    }
    
    /** Returns true if this set contains the specified element */
    public boolean contains(int key) {
        int index=hash(key);
        return bucketArray[index].exists(key);
    }
    
    public class Bucket0{
        private LinkedList<Integer> list;
        public Bucket0(){
            list=new LinkedList();
        }
        public void insert(Integer n){
            if(list.indexOf(n)==-1)
                list.add(n);
        }
        public void delete(Integer n){
            if(list.indexOf(n)!=-1)
                list.remove(n);
        }
        public boolean exists(Integer n){
            return list.indexOf(n)!=-1;
        }
    }
    public class Bucket{
        BSTree bstree;
        public Bucket(){
            bstree = new BSTree();
        }
        public void insert(Integer n){
            bstree.root = bstree.insertToBST(bstree.root, n);
        }
        public void delete(Integer n){
            bstree.root = bstree.deleteNode(bstree.root, n);
        }
        public boolean exists(Integer n){
            return bstree.searchBST(bstree.root, n)!=null;
        }
        
        
        class BSTree{
            TreeNode root=null;
            public TreeNode searchBST(TreeNode root,int val){
                if(root==null || root.val==val) return root;
                return root.val<val?searchBST(root.right,val):searchBST(root.left,val);
            }
            public TreeNode insertToBST(TreeNode root, int val){
                if(root==null)
                    return new TreeNode(val);
                if(root.val>val)
                    root.left = insertToBST(root.left,val);
                else if(root.val<val)
                    root.right = insertToBST(root.right,val);
                else
                    // skip the insertion
                    return root;
                return root;
            }
            
             /*
                * One step right and then always left
            */
            public int successor(TreeNode root){
                TreeNode p=root.right;
                while(p.left!=null){
                    p=p.left;
                }
                return p.val;
            }
            public int predecessor(TreeNode root){
                root=root.left;
                while(root.right!=null)
                    root=root.right;
                return root.val;
            }
            
            public TreeNode deleteNode(TreeNode root,int val){
                if(root==null) return root;
                if(root.val>val)
                    root.left=deleteNode(root.left,val);
                else if(root.val<val)
                    root.right=deleteNode(root.right,val);
                else{
                    if(root.left==null && root.right==null)
                        root=null;
                    else if(root.right!=null){
                        root.val=successor(root);
                        root.right=deleteNode(root.right,root.val);
                    }else{
                        root.val=predecessor(root);
                        root.left=deleteNode(root.left,root.val);
                    }
                }
                return root;
            }
        }
        
        public class TreeNode{
            int val;
            TreeNode left;
            TreeNode right;
            TreeNode(int v){
                val=v;
            }
        }
    }
    
}
}

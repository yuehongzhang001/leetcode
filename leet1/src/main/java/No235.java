/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author yuehongzhang
 */
import java.util.HashSet;
import java.util.ArrayList;
public class No235 {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(!containBoth(root, p,q)) return null;
        TreeNode result = root;
        while(true){
            if(containBoth(result.left,p,q))
                result = result.left;
            else if(containBoth(result.right,p,q))
                result = result.right;
            else
                return result;
        }
    }
    
    public boolean containNode(TreeNode root,TreeNode p){
        if(root==p) return true;
        if(root==null) return false;
        return containNode(root.left, p) || containNode(root.right, p);
    }
    
    public boolean containBoth(TreeNode root,TreeNode p, TreeNode q){
        return containNode(root,p) && containNode(root,q);
    }
    
    public static TreeNode lowestCommonAncestor1(TreeNode root, TreeNode p, TreeNode q) {
        ArrayList<TreeNode> list1 = new ArrayList();
        ArrayList<TreeNode> list2 = new ArrayList();
        boolean foundp = contains(list1, root, p);
        boolean foundq = contains(list2,root, q);
        if(!foundp || !foundq) return null;
        ArrayList<TreeNode> shortList = list1.size()>list2.size()?list2:list1;
        for(TreeNode t: list1){
            System.out.print(t.val+",");
        }
        System.out.println();
        for(TreeNode t: list2){
            System.out.print(t.val+",");
        }
        for(int i=0;i<shortList.size();i++){
            if(i==shortList.size()-1){
                return shortList.get(i);
            }
            if(list1.get(i+1).val!=list2.get(i+1).val)
                return shortList.get(i);
        }
        return null;
    }
    
    public static boolean contains(ArrayList list, TreeNode root, TreeNode target){
        if(root==target) {
            list.add(0,root);
            return true;
        }
        if(root==null)
            return false;
        if(contains(list, root.left,target)||contains(list, root.right,target)){
            list.add(0,root);
            return true;
        }
        return false;
    }
    
    public static TreeNode lowestCommonAncestor2(TreeNode root, TreeNode p, TreeNode q){
        int rootVal = root.val;
        int pVal = p.val;
        int qVal = q.val;
        if(pVal<rootVal && qVal<rootVal){
            return lowestCommonAncestor2(root.left,p,q);
        }else if(pVal>rootVal && qVal>rootVal)
            return lowestCommonAncestor2(root.right,p,q);
        else
            return root;
    }
    public static TreeNode lowestCommonAncestor3(TreeNode root, TreeNode p, TreeNode q){
        TreeNode node = root;
        int pval = p.val;
        int qval = q.val;
        while(node!=null){
            if(pval<node.val&&qval<node.val)
                node=node.left;
            else if(pval>node.val&&qval>node.val)
                node = node.right;
            else
                return node;
        }
        return null;
    }
}

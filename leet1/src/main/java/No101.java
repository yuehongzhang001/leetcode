/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author yuehongzhang
 */
import java.util.ArrayList;
import java.util.Queue;
import java.util.LinkedList;

public class No101 {
    public static boolean isSymmetric(TreeNode root) {
        return isSymmetric(new TreeNode[]{root});
       
    }
    
    public static boolean isSymmetric(TreeNode[] nodes){
        int len=nodes.length;
        int i=0,j=len-1;
        for(;i<=j;i++,j--){
            if(nodes[i]==null && nodes[j]!=null)
                return false;
            if(nodes[j]==null && nodes[i]!=null)
                return false;
            if(nodes[i]!=null &&nodes[j]!=null && nodes[i].val!=nodes[j].val)
                return false; 
        }
        ArrayList<TreeNode> list = new ArrayList();
        boolean allNull=true;
        for(i=0;i<len;i++){
            if(nodes[i]!=null){
                if(nodes[i].left!=null || nodes[i].right!=null)
                    allNull=false;
                list.add(nodes[i].left);
                list.add(nodes[i].right);
            }
        }
        if(allNull) return true;
        return isSymmetric(list.toArray(nodes));
    }
    
    
    public static boolean isMirror(TreeNode t1,TreeNode t2){
        if(t1==null && t2==null)
            return true;
        if(t1==null || t2==null)
            return false;
        if(t1.val!=t2.val)
            return false;
        return isMirror(t1.left,t2.right)&&isMirror(t1.right,t2.left);
    }
    public static boolean isSymmetric(TreeNode t1,TreeNode t2){
        Queue<TreeNode> q = new LinkedList();
        q.offer(t1);
        q.offer(t2);
        while(!q.isEmpty()){
            t1=q.poll();
            t2=q.poll();
            if(t1==null && t2 ==null){
                continue;
            }
            if(t1==null || t2==null || t1.val!=t2.val)
                return false;
            
            q.offer(t1.left);
            q.offer(t2.right);
            q.offer(t1.right);
            q.offer(t2.left);
        }
        return true;
    }
}

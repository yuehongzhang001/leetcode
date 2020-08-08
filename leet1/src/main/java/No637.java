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
public class No637 {
    
    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> list =new ArrayList();
        Deque<TreeNode> current = new LinkedList();
        Deque<TreeNode> next = new LinkedList();
        current.add(root);
        while(!current.isEmpty()){
            double sum=0;
            for(TreeNode node:current){
                sum+=node.val;
            }
            list.add(sum/current.size());
            while(!current.isEmpty()){
                TreeNode node = current.pollFirst();
                if(node.left!=null) next.addLast(node.left);
                if(node.right!=null) next.addLast(node.right);
            }
            Deque<TreeNode> tmp = current;
            current=next;
            next=tmp;
        }
        return list;
    }
    
    List<Double> sumList =new ArrayList();
    List<Integer> countList =new ArrayList();
    public List<Double> averageOfLevels1(TreeNode root){
        List<Double> list =new ArrayList();
        average(root,0);
        for(int i=0;i<sumList.size();i++){
            sumList.set(i, sumList.get(i)/countList.get(i));
        }
        return sumList;
    }
    public void average(TreeNode root, int i){
        if(root==null) return;
        if(i<sumList.size()){
            sumList.set(i, sumList.get(i)+root.val);
            countList.set(i, countList.get(i)+1);
        }else{
            sumList.add((double)root.val);
            countList.add(1);
        }
        average(root.left,i+1);
        average(root.right,i+1);
    }
}

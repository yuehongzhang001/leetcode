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
public class No589 {
    List<Integer> list1 = new ArrayList();
    public List<Integer> preorder(Node root) {
        order(root);
        return list1;
    }
    public void order(Node root){
        if(root==null) return;
        list1.add(root.val);
        for(Node c:root.children){
            order(c);
        }
    }
    public List<Integer> preorder1(Node root){
        List<Integer> list = new ArrayList();
        if(root==null) return list;
        Stack<Node> stack = new Stack();
        stack.add(root);
        while(!stack.isEmpty()){
            Node node = stack.pop();
            list.add(node.val);
            for(int i=node.children.size()-1;i>=0;i--){
                stack.push(node.children.get(i));
            }
        }
        return list;
    }
}

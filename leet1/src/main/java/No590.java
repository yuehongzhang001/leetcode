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
public class No590 {
    List<Integer> list1 = new LinkedList();
    public List<Integer> postorder1(Node root) {
         order(root);
         return list1;
    }
    public void order(Node root){
        if(root==null) return;
        for(Node c:root.children){
            order(c);
        }
        list1.add(root.val);
    }
    
    public List<Integer> postorder(Node root) {
        List<Integer> list = new LinkedList();
        Deque<Node> deque = new LinkedList();
        
    }
}

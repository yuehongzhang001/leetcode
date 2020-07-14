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
public class No559 {
    public class Node{
        public int val;
        public List<Node> children;
        
        public Node(int val){
            this.val=val;
        }
        public Node(int val,List<Node> l){
            this.val=val;
            children = l;
        }
    }
    
    public int maxDepth(Node root) {
        if(root==null)
            return 0;
        int max = 1;
        for(Node child: root.children){
            max = Math.max(max, maxDepth(child)+1);
        }
        return max;
    }
}

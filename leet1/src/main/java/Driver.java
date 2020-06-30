

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
import java.util.LinkedHashMap;
public class Driver {
    public static void main(String[] args){
        TreeNode t = new TreeNode(3);
        t.left = new TreeNode(1);
        t.right = new TreeNode(4);
        t.left.right = new TreeNode(2);
        System.out.println(No235.lowestCommonAncestor1(t, t.left.right, t.right).val);
    }
    
    
}

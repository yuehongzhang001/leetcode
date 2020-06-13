

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author yuehongzhang
 */
public class Driver {
    public static void main(String[] args){
        String s="   ";
        int[] nums1={1,2,3,0,0,0};
        int[] nums2={2,5,6};
        int[] a=null;
        TreeNode t1 = new TreeNode(1);
        t1.left=new TreeNode(2);
        t1.right=new TreeNode(3);
        System.out.print(No101.isSymmetric(t1));
    }
    
    
}

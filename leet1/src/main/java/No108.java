/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author yuehongzhang
 */
import java.util.LinkedList;
public class No108 {
    public TreeNode sortedArrayToBST(int[] nums){
        return helper(nums,0,nums.length-1);
    }
    
    public TreeNode helper(int[] nums, int low,int high){
        if(low>high) return null;
        int mid = (low+high)/2;
        TreeNode root = new TreeNode(nums[mid]);


        root.left = helper(nums, low, mid-1);
        root.right = helper(nums,mid+1,high);
        return root;
    }
    
    public TreeNode sortedArrayToBST1(int[] nums) {
        if(nums.length==0) return null;
        int len=nums.length;
        int mid = (0+len-1)/2;
        
        TreeNode root = new TreeNode(nums[0]);
        root.left=helper(nums,0,mid);
        root.right=helper(nums,mid+1,len);
        return root;
    }
    public TreeNode helper1(int[] nums, int start, int end){
        if(start >= end) return null;
        LinkedList<TreeNode> levelList = new LinkedList();
        TreeNode root = new TreeNode(nums[start]);
        levelList.add(root);
        int j=start+1;
        while(!levelList.isEmpty()){
            int size = levelList.size();
            for(int i=0;i<size;i++){
                TreeNode node=levelList.removeFirst();
                if(j<end){
                    node.left=new TreeNode(nums[j++]);
                    levelList.addLast(node.left);
                }else{
                    return root;
                }
                if(j<end){
                    node.right=new TreeNode(nums[j++]);
                    levelList.addLast(node.right);
                }
                else
                    return root;
            }
        }
        return root;
    }
}

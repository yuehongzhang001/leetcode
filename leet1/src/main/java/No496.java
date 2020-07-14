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
public class No496 {
    public static int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] res = new int[nums1.length];
        for(int i=0;i<nums1.length;i++){
            int j=0;
            while(nums1[i]!=nums2[j]){
                j++;
            }
            while(j<nums2.length && nums2[j]<=nums1[i]){
                j++;
            }
            res[i]= (j==nums2.length?-1:nums2[j]);
        }
        return res;
    }
    
    public static int[] nextGreaterElement1(int[] nums1, int[] nums2){
        Stack<Integer> stack = new Stack();
        HashMap<Integer,Integer> map = new HashMap();
        for(int i=0;i<nums2.length;i++){
            if(i+1<nums2.length){
                if(nums2[i]<nums2[i+1]){
                    map.put(nums2[i], nums2[i+1]);
                    while(!stack.isEmpty() && stack.peek()<nums2[i+1]){
                        map.put(stack.pop(), nums2[i+1]);
                    }
                }else{
                    stack.push(nums2[i]);
                }
            }else{
                map.put(nums2[i], -1);
                while(!stack.isEmpty()){
                    map.put(stack.pop(), -1);
                }
            }
        }
        int[] res = new int[nums1.length];
        for(int i=0;i<nums1.length;i++){
            res[i]=map.get(nums1[i]);
        }
        return res;
    }
    
    public static int[] nextGreaterElement2(int[] nums1, int[] nums2){
        Stack<Integer> stack = new Stack();
        HashMap<Integer,Integer> map = new HashMap();
        for(int n: nums2){
            while(!stack.isEmpty() && stack.peek()<n){
                map.put(stack.pop(), n);
            }
            stack.push(n);
        }
        while(!stack.isEmpty()){
            map.put(stack.pop(), -1);
        }
        int[] res = new int[nums1.length];
        for(int i=0;i<nums1.length;i++){
            res[i]=map.get(nums1[i]);
        }
        return res;
    }
}

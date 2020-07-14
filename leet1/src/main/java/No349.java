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
public class No349 {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set1 = new HashSet();
        HashSet<Integer> set = new HashSet();
        
        for(int i=0;i<nums1.length;i++){
            set1.add(nums1[i]);
        }
        for(int i=0;i<nums2.length;i++){
            if(set1.contains(nums2[i]))
                set.add(nums2[i]);
        }
        int size = set.size();
        int[] result = new int[size];
        int i=0;
        for(Integer e: set){
            result[i++]=e;
        }
        return result;
        
    }
    public int[] intersection1(int[] nums1, int[] nums2){
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        HashSet<Integer> set = new HashSet();
        for(int i=0,j=0;i<nums1.length&&j<nums2.length;){
            if(nums1[i]==nums2[j]){
                set.add(nums1[i]);
                i++;
                j++;
            }
            else if(nums1[i]<nums2[j])
                i++;
            else
                j++;
        }
        
        int[] result = new int[set.size()];
        int i=0;
        for(Integer e: set){
            result[i++]=e;
        }
        return result;
    }
    
}

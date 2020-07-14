
import java.util.Arrays;

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
public class No350 {
    public int[] intersect(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        ArrayList<Integer> list = new ArrayList();
        for(int i=0,j=0;i<nums1.length && j<nums2.length;){
            if(nums1[i]==nums2[j]){
                list.add(nums1[i]);
                i++;
                j++;
            }else  if(nums1[i]<nums2[j])
                i++;
            else
                j++;
        }
        int[] arr = new int[list.size()];
       for(int i=0;i<list.size();i++){
           arr[i] = list.get(i);
       }
       return arr;
    }
    public int[] intersect1(int[] nums1, int[] nums2){
        HashMap<Integer,Integer> map = new HashMap();
        for(int n: nums1){
            map.put(n, map.getOrDefault(n, 0)+1);
        }
        ArrayList<Integer> list = new ArrayList();
        for(int i=0;i<nums2.length;i++){
            int count = map.getOrDefault(nums2[i], 0);
            if(count>0){
                list.add(nums2[i]);
                map.put(nums2[i], count-1);
            }  
        }
        int[] arr = new int[list.size()];
       for(int i=0;i<list.size();i++){
           arr[i] = list.get(i);
       }
       return arr;
    }
}

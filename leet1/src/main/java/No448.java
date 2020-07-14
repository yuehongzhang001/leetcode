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
public class No448 {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> list = new ArrayList();
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=i+1){
                int prev=nums[i];
                while(nums[prev-1]!=prev){
                    int temp = nums[prev-1];
                    nums[prev-1]=prev;
                    prev = temp;
                }
            }
        }
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=i+1)
                list.add(i+1);
        }
        return list;
        
    }
    public List<Integer> findDisappearedNumbers1(int[] nums) {
        List<Integer> list = new ArrayList();
        HashSet<Integer> set = new HashSet();
        for(int i=0;i<nums.length;i++){
            set.add(nums[i]);
        }
        for(int i=0;i<nums.length;i++){
            if(!set.contains(i+1))
                list.add(i+1);
        }
        return list;
    }
     public List<Integer> findDisappearedNumbers2(int[] nums){
         List<Integer> list = new ArrayList();
         int len = nums.length;
         boolean[] map = new boolean[len];
         for(int i=0;i<len;i++){
             map[nums[i]-1]=true;
         }
         for(int i=0;i<len;i++){
             if(map[i]==false)
                 list.add(i+1);
         }
         return list;
     }
     public List<Integer> findDisappearedNumbers3(int[] nums){
         List<Integer> list = new ArrayList();
         int len = nums.length;
         for(int i=0;i<len;i++){
             int n=Math.abs(nums[i]);
             if(nums[n-1]>0) nums[n-1]=0-nums[n-1];
         }
         for(int i=0;i<len;i++){
             if(nums[i]>0)
                 list.add(i+1);
         }
         return list;
     }
}

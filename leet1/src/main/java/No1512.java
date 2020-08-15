/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author yuehongzhang
 */
public class No1512 {
     public int numIdenticalPairs(int[] nums) {
         int[] map = new int[101];
         int ans=0;
         for(int n:nums)
             map[n]++;
         for(int n:map){
             ans+=n*(n-1)/2;
         }
         return ans;
    }
}

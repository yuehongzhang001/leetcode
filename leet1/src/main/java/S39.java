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
public class S39 {
    public int majorityElement(int[] nums) {
        int len=nums.length;
        HashMap<Integer,Integer> map = new HashMap();
        for(int n:nums){
            int times=map.getOrDefault(n, 0)+1;
            if(times>len/2) return n;
            map.put(n, times);
        }
        return -1;
            
        
    }
    public int majorityElement1(int[] nums){
        int x=0,votes=0;
        for(int n:nums){
            if(votes==0)x=n;
            votes+=n==x?1:-1;
        }
        return x;
    }
}

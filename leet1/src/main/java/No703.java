
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
public class No703 {
    int size;
    PriorityQueue<Integer> pq;
    
    public No703(int k, int[] nums) {
        size=k;
        pq=new PriorityQueue(k);
        for(int n:nums){
            add(n);
        }
    }
    
    public int add(int val) {
        if(pq.size()<size)
            pq.add(val);
        else if(val>pq.peek()){
            pq.poll();
            pq.add(val);
        }
        return pq.peek();
    }
}

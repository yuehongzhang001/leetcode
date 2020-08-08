/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author yuehongzhang
 */
public class No849 {
    
    public int maxDistToClosest(int[] seats) {
        int max=1;
        Integer prev=null;
        for(int i=0;i<seats.length;i++){
            if(seats[i]==1){
                max=prev==null?Math.max(max, i):Math.max(max, (i-prev)/2);
                prev=i;
            }
        }
        max=Math.max(max, seats.length-1-prev);
        return max;
    }
}

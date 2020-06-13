/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author yuehongzhang
 */
public class No69 {
     public static int mySqrt(int x) {
        int low=0;
        int high=x;
        while(low<=high){
            int middle = (low+high)/2;
            int sqr = middle*middle;
            if(sqr==x){
                return middle;
            }else if(sqr<x){
                low = middle+1;
            }else{
                high = middle-1;
            }
        }
        return high;
        
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author yuehongzhang
 */
public class No941 {
    public boolean validMountainArray(int[] A) {
        if(A.length<3) return false;
        int low=0;
        int high=A.length-1;
        while(low<A.length-1 && A[low]<A[low+1]){
            low++;
        }
        while(high>0 && A[high]<A[high-1])
            high--;
        if(low==A.length-1 || high==0)
            return false;
        return low==high;
    }
}

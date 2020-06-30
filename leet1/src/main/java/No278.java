/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author yuehongzhang
 */
public class No278 {
    public int firstBadVersion(int n) {
        int low=1;
        int high=n;
        while(low<high){
            int mid = low+(high-low)/2;
            if(isBadVersion(mid))
                high=mid;
            else
                low=mid+1;
        }
        return low;
    }
    
    boolean isBadVersion(int version){
        return true;
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author yuehongzhang
 */
public class N0367 {
    public boolean isPerfectSquare(int num) {
        if(num<0) return false;
        long low =0;
        long high = num;
        while(low<high){
            long mid = (low+high)/2;
            long sqr = mid*mid;
            if(sqr==num)
                return true;
            if(sqr<num)
                low=mid+1;
            if(sqr>num)
                high=mid-1;
        }
        return false;
    }
}

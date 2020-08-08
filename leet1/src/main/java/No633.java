/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author yuehongzhang
 */
public class No633 {
    public boolean judgeSquareSum(int c) {
        for(long i=0;i<=Math.sqrt(c/2);i++){
            double d = Math.sqrt(c-i*i);
            if(Math.floor(d)==d)
                return true;
        }
        return false;
    }
    public boolean judgeSquareSum1(int c){
        long l=0, r=(long)Math.sqrt(c);
        while(l<=r){
            long res = l*l+r*r;
            if(res==c) return true;
            else if(res>c) r--;
            else l++;
        }
        return false;
    }
    
}

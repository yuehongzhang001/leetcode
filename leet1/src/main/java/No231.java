/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author yuehongzhang
 */
public class No231 {
    public boolean isPowerOfTwo(int n) {
       double log = Math.log(n)/Math.log(2);
       return log == Math.floor(log);
    }
    
    public boolean isPowerOfTwo1(int n) {
        while(n!=1){
            if(n%2!=0)
                return false;
            n/=2;
        }
        return true;
    }
}

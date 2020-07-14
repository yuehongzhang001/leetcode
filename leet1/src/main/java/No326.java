/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author yuehongzhang
 */
public class No326 {
    public boolean isPowerOfThree(int n) {
        double root = Math.log(n)/Math.log(3);
        return Math.floor(root) == root;
    }
    
    public boolean isPowerOfThree1(int n){
        if(n==0) return false;
        if(n==1) return true;
        if(n%3!=0) return false;
        return isPowerOfThree(n/3);
    }
}

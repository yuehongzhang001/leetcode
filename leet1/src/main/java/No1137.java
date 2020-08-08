/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author yuehongzhang
 */
public class No1137 {
    public int tribonacci(int n) {
        if(n==0) return 0;
        if(n==1) return 1;
        if(n==2) return 1;
        return tribonacci(n-1)+tribonacci(n-2)+tribonacci(n-3);
    }
     public int tribonacci1(int n){
         if(n==0) return 0;
        if(n==1) return 1;
        if(n==2) return 1;
        int t0=0;
        int t1=1;
        int t2=1;
        int res=0;
        int i=3;
        while(i<=n){
            res=t0+t1+t2;
            t0=t1;
            t1=t2;
            t2=res;
            i++;
        }
        return res;
     }
}

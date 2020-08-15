/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author yuehongzhang
 */
public class Sword10 {
    public int fib(int n) {
        int f0=0;
        int f1=1;
        if(n==0) return f0;
        if(n==1) return f1;
        int fn=1;
        for(int i=2;i<=n;i++){
            fn=(f0+f1)%1000000007;
            f0=f1;
            f1=fn;
        }
        return fn;
    }
}

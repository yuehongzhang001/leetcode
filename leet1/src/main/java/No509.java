/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author yuehongzhang
 */
public class No509 {
    public int fib(int N) {
         if(N==0) return 0;
         if(N==1) return 1;
         return fib(N-1)+fib(N-2);
    }
    public int fib1(int N){
        if(N==0) return 0;
        if(N==1) return 1;
        int f1 = 0;
        int f2 = 1;
        for(int i=2;i<=N;i++){
            int f = f1+f2;
            f1=f2;
            f2=f;
        }
        return f2;
    }
}

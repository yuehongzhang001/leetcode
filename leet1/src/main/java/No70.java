/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author yuehongzhang
 */
public class No70 {
    public static int climbStairs(int n) {
        long result=0;
        long i=0;
        while(i<=n-i){
            result+=c(n-i,i);
            i++;
        }
        return (int)result;
    }
    public static long c(long n, long r){
        long result=1;
        long item=n;
        while(item>=n-r+1){
            result*=item;
            item--;
        }
        item=r;
        while(item>=1){
            result/=item;
            item--;
        }
        return result;
    }
    public static int f(int n){
        if(n==0) return 1;
        if(n==1) return 1;
        return f(n-1)+f(n-2);
    }
    public static int climbStairs1(int n){
        int p=0, q=0, r=1;
        for(int i=1;i<=n;i++){
            p=q;
            q=r;
            r=p+q;
        }
        return r;
    }
}

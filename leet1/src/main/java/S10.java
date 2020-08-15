/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author yuehongzhang
 */
public class S10 {
    public int numWays(int n) {
        if(n==0) return 1;
        if(n==1) return 1;
        return (numWays(n-1)+numWays(n-2))%1000000007;
    }
    public int numWays1(int n){
        int a=1,b=1;
        int sum=0;
        for(int i=0;i<n;i++){
            sum=(a+b)%1000000007;
            a=b;
            b=sum;
        }
        return a;
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author yuehongzhang
 */
public class No1175 {
    public int numPrimeArrangements(int n) {
        int[] ps = new int[n+1];
        for(int i=2;i<n+1;i++){
            if(ps[i]==0){
                int j=i+i;
                while(j<=n){
                    ps[j]=1;
                    j+=i;
                }
            }
        }
        int numOfPrime = 0;
        for(int i=2;i<=n;i++){
            if(ps[i]==0) numOfPrime++;
        }
        int numNotPrime=n-numOfPrime;
        return (int)(cal(numOfPrime)*cal(numNotPrime)%1000000007);
    }
    public long cal(int n){
        long res=1;
        int i=1;
        while(i<=n){
            res*=i;
            res=res%1000000007;
            i++;
        }
        return res;
    }
}

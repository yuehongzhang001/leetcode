/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author yuehongzhang
 */
public class No650 {
    public int minSteps(int n) {
        if(n==1) return 0;
        int ans=0;
        while(n>1){
            int m=2;
            boolean flag=false;
            while(m<=Math.sqrt(n)){
                if(n%m==0){
                    ans+=m;
                    flag=true;
                    break;
                }
                m++;
            }
            if(!flag){
                ans+=n;
                break;
            }
            n/=m;
        }
        return ans;
    }
    
    public int minSteps1(int n){
        int ans=0;
        int d=2;
        while(n>1){
            while(n%d==0){
                ans+=d;
                n/=d;
            }
            d++;
        }
        return ans;
    }
}

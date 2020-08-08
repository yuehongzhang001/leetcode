/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author yuehongzhang
 */
public class No1010 {
    public int numPairsDivisibleBy60(int[] time) {
        int ans=0;
         for(int i=0;i<time.length-1;i++){
             for(int j=i+1;j<time.length;j++){
                 if((time[i]+time[j])%60==0)
                     ans++;
             }
         }
         return ans;
    }
    public int numPairsDivisibleBy601(int[] time) {
        int[] map = new int[60];
        for(int n:time){
            map[n%60]++;
        }
        int ans=map[0]*(map[0]-1)/2;
        for(int i=1;i<30;i++){
           ans+=map[i]*map[60-i];
        }
        ans+=map[30]*(map[30]-1)/2;
        return ans;
    }
}

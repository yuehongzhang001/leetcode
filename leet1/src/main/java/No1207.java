/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author yuehongzhang
 */
public class No1207 {
    public boolean uniqueOccurrences(int[] arr) {
        int[] times=new int[2001];
        for(int n:arr){
            times[n+1000]++;
        }
        int[] tt=new int[1001];
        for(int n:times){
            if(n!=0 && tt[n]!=0)
                return false;
            tt[n]=1;
        }
        return true;
    }
    

}

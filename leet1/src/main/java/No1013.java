/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author yuehongzhang
 */
public class No1013 {
    public boolean canThreePartsEqualSum(int[] A) {
        int len =A.length;
        int sum=0;
        for(int n:A){
            sum+=n;
        }
        if(sum%3!=0) return false;
        int i=0;
        int s1=0;
        while(i<len){
            s1+=A[i++];
            if(s1==sum/3)
                break;
        }
        if(i==len) return false;
        int s2=0;
        while(i<len){
            s2+=A[i++];
            if(s2==sum/3)
                break;
        }
        if(i==len) return false;
        return true;
    }
}

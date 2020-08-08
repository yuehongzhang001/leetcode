/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author yuehongzhang
 */
public class No961 {
    public int repeatedNTimes(int[] A) {
        int[] times = new int[9999];
        for(int n:A){
            if(times[n]==1)
                return n;
            else
                times[n]++;
        }
        return -1;
    }
    public int repeatedNTimes1(int[] A){
        for(int j=1;j<=3;j++){
            for(int i=0;i<A.length;i++){
                if(A[i]==A[i+j])
                    return A[i];
            }
        }
        throw null;
    }
}

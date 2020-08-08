
import java.util.Arrays;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author yuehongzhang
 */
public class No908 {
    public int smallestRangeI(int[] A, int K) {
        int max=A[0];
        int min=A[0];
        for(int n:A){
            max=Math.max(max, n);
            min=Math.min(min,n);
        }
        int ans=max-K-min-K;
        return ans>=0?ans:0;
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author yuehongzhang
 */
public class No832 {
    public int[][] flipAndInvertImage(int[][] A) {
        for(int i=0;i<A.length;i++){
            int len = A[0].length;
            for(int l=0,r=len-1;l<=r;l++,r--){
                int tmp = A[i][l];
                A[i][l]=1-A[i][r];
                A[i][r]=1-tmp;
            }
        }
        return A;
    }
}

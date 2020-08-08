/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author yuehongzhang
 */
import java.util.*;
public class No977 {
    public int[] sortedSquares(int[] A) {
        int len = A.length;
        int[] ans = new int[len]; 
        int j=-1;
        for(int i=0;i<len;i++){
            if(A[i]>=0 && j==-1){
                j=i;
            }
            A[i]=A[i]*A[i];
        }
        if(j==0)
            return A;
        if(j==-1){
            for(int i=0;i<len/2;i++){
                int tmp=A[i];
                A[i]= A[len-1-i];
                A[len-1-i]=tmp;
            }
            return A;
        }else{
            int l=j-1;
            int r=j;
            for(int i=0;i<len;i++){
                if(l<0){
                    ans[i]=A[r++];
                }else if(r>len-1)
                    ans[i]=A[l--];
                else
                    ans[i]=A[l]>A[r]?A[r++]:A[l--];
            }
            return ans;
        }
        
            
    }
}

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
public class No976 {
    public int largestPerimeter(int[] A) {
         Arrays.sort(A);
         
         for(int i=A.length-1; i>=2;i--){
             if(A[i-2]+A[i-1]>A[i])
                 return A[i-2]+A[i-1]+A[i];
         }
         return 0;
    }
}

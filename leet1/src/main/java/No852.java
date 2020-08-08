/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author yuehongzhang
 */
public class No852 {
    public int peakIndexInMountainArray(int[] A) {
        for(int i=0;i<A.length-1;i++){
            if(A[i]>A[i+1])
                return i;
        }
        return -1;
    }
    
     public int peakIndexInMountainArray1(int[] A){
         int low=0;
         int high=A.length-1;
         while(low<high){
             int mid = (high+low)/2;
             if(A[mid]<A[mid+1])
                 low=mid+1;
             else
                 high=mid;
         }
         return low;
     }
}

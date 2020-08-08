/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author yuehongzhang
 */
public class No905 {
    public int[] sortArrayByParity(int[] A) {
        int len = A.length;
        int[] ans = new int[len];
        int low=0;
        int high=len-1;
        for(int i=0;i<len;i++){
            if(A[i]%2==0){
                ans[low++]=A[i];
            }else{
                ans[high--]=A[i];
            }
        }
        return ans;
    }
    public int[] sortArrayByParity1(int[] A){
        int len = A.length;
        int low=0;
        int high=len-1;
        int tmp ;
        while(low<high){
            if(A[low]%2==0)
                low++;
            else{
                while(low<high && A[high]%2!=0)
                    high--;
                if(low<high){
                    tmp = A[high];
                    A[high]=A[low];
                    A[low]=tmp;
                }
            }
        }
        return A;
        
    }
}

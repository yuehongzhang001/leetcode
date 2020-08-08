/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author yuehongzhang
 */
public class No922 {
    public int[] sortArrayByParityII(int[] A) {
        int len=A.length;
        int[] even=new int[(len+1)/2];
        int[] odd = new int[len/2];
        int i=0;
        int j=0;
        for(int n:A){
            if(n%2==0)
                even[i++]=n;
            else
                odd[j++]=n;
        }
        i=0;
        j=0;
        for(int k=0;k<len;k++){
            if(k%2==0)
                A[k]=even[i++];
            else
                A[k]=odd[j++];
        }
        return A;
    }
    
    public int[] sortArrayByParityII1(int[] A){
        int len=A.length;
        int j=1;
        for(int i=0;i<len;i+=2){
            if(A[i]%2!=0){
                while(A[j]%2!=0)
                    j+=2;
                int tmp = A[j];
                A[j] = A[i];
                A[i]=tmp;
                j+=2;
            }
        }
        return A;
    }
}

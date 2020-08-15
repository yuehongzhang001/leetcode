/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author yuehongzhang
 */
public class No1539 {
    public int findKthPositive(int[] arr, int k) {
        int n=1;
        int len=arr.length;
        int count=0;
        for(int i=0;i<len;i++){
            while(arr[i]!=n){
                count++;
                if(count==k)
                    return n;
                else
                    n++;
            }
            n++;
        }
        while(count!=k){
            n++;
            count++;
        }
        return n-1;
    }
}

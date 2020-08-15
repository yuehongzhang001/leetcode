/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author yuehongzhang
 */

public class No1534 {
    public int countGoodTriplets(int[] arr, int a, int b, int c) {
        int ans=0;
        int len=arr.length;
        for(int i=0;i<len-2;i++){
            for(int j=i+1;j<len-1;j++){
                if(Math.abs(arr[i]-arr[j])<=a){
                    for(int k=j+1;k<len;k++){
                        if(Math.abs(arr[j]-arr[k])<=b && Math.abs(arr[i]-arr[k])<=c)
                            ans++;
                    }
                }
                
            }
        }
        return ans;
    }
}

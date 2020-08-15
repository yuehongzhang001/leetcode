/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author yuehongzhang
 */
public class No1385 {
    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        int ans=0;
        for(int i=0;i<arr1.length;i++){
            boolean flag=true;
            for(int j=0;j<arr2.length;j++){
                if(arr2[j]<=arr1[i]+d && arr2[j]>=arr1[i]-d){
                    flag=false;
                    break;
                }  
            }
            if(flag) ans++;
        } 
        return ans;
    }
}

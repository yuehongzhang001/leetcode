/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author yuehongzhang
 */
public class No1304 {
    public int[] sumZero(int n) {
        int[] ans =new int[n];
        int left=0-n/2;
        for(int i=0;i<n;i++){
            if(n%2==0 && left==0){
                i--;
                left++;
            }else{
                ans[i]=left++;
            }
        }
        return ans;
    }
    
    public int[] sumZero1(int n){
        if(n==1) return new int[]{0};
        int[] ans= new int[n];
        for(int i=0;i<n-1;i++){
            ans[i]=i+1;
        }
        ans[n-1]=0-(n-1)*n/2;
        return ans;
    }
}

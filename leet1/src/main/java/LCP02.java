/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author yuehongzhang
 */
public class LCP02 {
    public int[] fraction(int[] cont) {
        int len=cont.length;
        int[] ans=new int[2];
        ans[0]=cont[len-1];
        ans[1]=1;
        for(int i=len-2;i>=0;i--){
            int n=cont[i];
            int n0=ans[0];
            int n1=ans[1];
            ans[0]=n*n0+n1;
            ans[1]=n0;
        }
        return ans;
    }

}

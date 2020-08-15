/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author yuehongzhang
 */
public class S17 {
    public int[] printNumbers(int n) {
        int power=10;
        while(n!=1){
            power*=10;
            n--;
        }
        int[] ans = new int[power];
        for(int i=0;i<power-1;i++){
            ans[i]=i+1;
        }
        return ans;
    }
}

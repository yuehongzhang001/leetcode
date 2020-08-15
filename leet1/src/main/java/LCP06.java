/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author yuehongzhang
 */
public class LCP06 {
    public int minCount(int[] coins) {
        int ans=0;
        for(int n:coins)
            ans+=(n+1)/2;
        return ans;
    }
}

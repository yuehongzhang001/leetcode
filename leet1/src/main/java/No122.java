/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author yuehongzhang
 */
public class No122 {
    public int maxProfit(int[] prices) {
        if(prices.length<2) return 0;
        int max=0;
        for(int i=1;i<prices.length;i++){
            if(prices[i]>prices[i-1])
                max+=prices[i]-prices[i-1];
        }
        return max;
    }
}

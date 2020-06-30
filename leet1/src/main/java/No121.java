/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author yuehongzhang
 */
public class No121 {
    public int maxProfit(int[] prices) {
        int len=prices.length;
        int max=0;
        for(int i=0;i<len-1;i++){
            for(int j=i+1;j<len;j++){
                int sub = prices[j]-prices[i];
                if(sub>max)
                    max=sub;
            }
        }
        return max;
    }
    //[7,1,5,0,9]
    public int maxProfit1(int[] prices){
        int maxProfit=0;
        int lowestIndex=0;
        for(int i=1;i<prices.length;i++){
            if(prices[lowestIndex]>prices[i])
                lowestIndex=i;
            if(maxProfit<prices[i]-prices[lowestIndex])
                maxProfit=prices[i]-prices[lowestIndex];
        }
        return maxProfit;
    }
    
    
}

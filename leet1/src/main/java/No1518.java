/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author yuehongzhang
 */
public class No1518 {
    public int numWaterBottles(int numBottles, int numExchange) {
        int full=numBottles;
        int empty=0;
        int ans=0;
        while(full+empty>=numExchange){
            ans+=full;
            empty+=full;
            full=empty/numExchange;
            empty=empty%numExchange;
        }
        ans+=full;
        return ans;
        
    }
    
     public int numWaterBottles1(int numBottles, int numExchange){
         int ans=numBottles;
         int bottle=numBottles;
         while(bottle>=numExchange){
             int full=bottle/numExchange;
             ans+=full;
             bottle=bottle%numExchange+full;
         }
         return ans;
     }
}

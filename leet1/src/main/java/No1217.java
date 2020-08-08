/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author yuehongzhang
 */
public class No1217 {
    public int minCostToMoveChips(int[] chips) {
        int even=0;
        int odd=0;
        for(int n:chips){
            if(n%2==0) even++;
            else odd++;
        }
        return Math.min(odd, even);
    }
}

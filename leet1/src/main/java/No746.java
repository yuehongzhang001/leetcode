/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author yuehongzhang
 */
public class No746 {
    public int minCostClimbingStairs(int[] cost) {
        int f0=Math.min(cost[0], cost[1]);
        if(cost.length==2) return f0;
        int f1=Math.min(cost[0]+cost[1], Math.min(cost[0]+cost[2], cost[1]));
        if(cost.length==3) return f1;
        for(int n=4;n<=cost.length;n++){
            int fn = Math.min(f0+cost[n-2],f1+cost[n-1]);
            f0=f1;
            f1=fn;
        }
        return f1;
    }
    

    
    public int minCostClimbingStairs1(int[] cost){
        int f1=0;
        int f2=0;
        for(int i=cost.length-1;i>=0;i--){
            int f0=cost[i]+Math.min(f1, f2);
            f1=0;
        }
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author yuehongzhang
 */
import java.util.*;
public class No1029 {
    public int twoCitySchedCost(int[][] costs) {
        Arrays.sort(costs, (a,b)->{
            return Math.max(b[0], b[1])-Math.max(a[0], a[1]);
        });
        int num0=0;
        int num1=0;
        int sum=0;
        int len = costs.length;
        int N = len/2;
        for(int i=0;i<len;i++){
            if(num0<N && num1<N){
                if(costs[i][0]>costs[i][1]){
                    sum+=costs[i][1];
                    num1++;
                }else if(costs[i][0]<costs[i][1]){
                    sum+=costs[i][0];
                    num0++;
                }else
                    sum+=costs[i][0];
            }else if(num0==N){
                sum+=costs[i][1];
            }else
                sum+=costs[i][0];
        }
        return sum;
    }
    
    public int twoCitySchedCost1(int[][] costs){
        Arrays.sort(costs,(a,b)->{
            return (a[1]-a[0])-(b[1]-b[0]);
        });
        int n=costs.length/2;
        int sum=0;
        for(int i=0;i<n;i++){
            sum+=costs[i][1]+costs[i+n][0];
        }
        return sum;
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author yuehongzhang
 */
public class No1491 {
    public double average(int[] salary) {
        int sum=0;
        int max=1000;
        int min=1000000;
        for(int n:salary){
            sum+=n;
            max=Math.max(max, n);
            min=Math.min(min, n);
        }
        return (double)(sum-max-min)/(salary.length-2);
    }
}

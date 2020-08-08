/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author yuehongzhang
 */
public class No1281 {
    public int subtractProductAndSum(int n) {
        int mul=1;
        int sum=0;
        while(n!=0){
            int d=n%10;
            mul*=d;
            sum+=d;
            n/=10;
        }
        return mul-sum;
    }
}

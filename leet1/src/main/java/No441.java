/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author yuehongzhang
 */
public class No441 {
    public int arrangeCoins(int n) {
        long k=0;
        long sum=0;
        while(sum<=n){
            k++;
            sum+=k;
        }
        return (int)(k-1);
    }
    public int arrangeCoins1(int n){
        double result = Math.sqrt(0.25+2*n)-0.5;
        return (int)Math.floor(result);
    }
    
    public int arrangeCoins12(int n){
        long low =1;
        long high = n;
        while(low<high){
            long mid = low+(high-low)/2;
            long result = mid*(mid+1);
            if(result==n){
                return (int)mid;
            }else if(result>n){
                high = mid-1;
            }else
                low = mid+1;
        }
        return (int)(low-1);
    }
}

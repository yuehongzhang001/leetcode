/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author yuehongzhang
 */
public class No1295 {
    public int findNumbers(int[] nums) {
        int ans=0;
        for(int n:nums){
            int numOfDigit=0;
            while(n!=0){
                numOfDigit++;
                n/=10;
            }
            if(numOfDigit%2==0) ans++;
            
        }
        return ans;
    }
    
    public int findNumbers1(int[] nums){
        int ans=0;
        for(int n:nums){
           ans+=(int)Math.log10(n)%2;
        }
        return ans;
    }
    public int findNumbers2(int[] nums){
        int ans=0;
        for(int n:nums){
           ans+=((""+n).length()+1)%2;
        }
        return ans;
    }
}

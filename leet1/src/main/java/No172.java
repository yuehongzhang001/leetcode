/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author yuehongzhang
 */
public class No172 {
    public int trailingZeroes(int n) {
        int result = times(n);
        int count=0;
        while(result!=0){
            if(result%10==0)
                count++;
            result/=10;
        }
        return count;
    }
     public int times(int n){
         if(n==0) return 1;
         return n*times(n-1);
     }
     
     public int trailingZeroes1(int n){
         int count = 0;
         for(int i=1;i<=n;i++){
             int base=5;
             while(i%base!=0){
                 count++;
                 base*=5;
             }
         }
         return count;
     }
     
     public int trailingZeroes2(int n){
         if(n==1) return 0;
         return trailingZeroes2(n/5)+n;
     }
     
     public int trailingZeroes3(int n){
         int count=0;
         int base=5;
         while(n/base!=0){
             count+=n/base;
             base*=5;
         }
         return count;
     }
    
}

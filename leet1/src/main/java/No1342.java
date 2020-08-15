/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author yuehongzhang
 */
public class No1342 {
     public int numberOfSteps (int num) {
         int ans=0;
         while(num!=0){
             if(num%2==0) num/=2;
             else
                 num--;
             ans++;
         }
         return ans;
    }
}

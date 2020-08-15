/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author yuehongzhang
 */
public class No1413 {
    public int minStartValue(int[] nums) {
        int ans=1;
        int sum=1;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            if(sum<1){
                ans+=1-sum;
                sum=1;
            }
        }
        return ans;
    }
    
     public int minStartValue1(int[] nums){
         int start=1;
         int sum=0;
         for(int i=0;i<nums.length;i++){
             sum+=nums[i];
             if(start+sum<1)
                 start=1-sum;
         }
         return start;
     }
}

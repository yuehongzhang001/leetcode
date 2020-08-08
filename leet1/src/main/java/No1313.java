/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author yuehongzhang
 */
public class No1313 {
    public int[] decompressRLElist(int[] nums) {
        int len=0;
        for(int i=0;i<nums.length;i+=2){
            len+=nums[i];
        }
        int[] ans = new int[len];
        int j=0;
        for(int i=0;i<nums.length;i+=2){
            int times=nums[i];
            int num = nums[i+1];
            while(times>0){
                ans[j++]=num;
                times--;
            }
        }
        return ans;
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author yuehongzhang
 */
public class No53 {
    public static int maxSubArray(int[] nums) {
        if(nums.length==0) return 0;
        int max=nums[0];
        for(int i=0;i<nums.length;i++){
            int result=0;
            for(int j=i;j<nums.length;j++){
                result+=nums[j];
                if(max<result)
                    max=result;
            }
        }
        return max;
    }
}

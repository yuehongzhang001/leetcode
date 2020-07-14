/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author yuehongzhang
 */
import java.util.Arrays;
public class No561 {
    public int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        int res = 0; 
        for(int i=0;i<nums.length;i+=2){
            res+=nums[i];
        }
        return res;
    }
}

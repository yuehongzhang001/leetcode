
import java.util.Arrays;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author yuehongzhang
 */
public class No453 {
    public int minMoves(int[] nums) {
        int ans=0;
        
        int low = Integer.MAX_VALUE;
        for(int n:nums)
            low=Math.min(low, n);
        for(int i=nums.length-1;i>=0;i--){
            ans+=nums[i]-low;
        }
        return ans;
    }
}

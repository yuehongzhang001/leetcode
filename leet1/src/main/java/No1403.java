/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author yuehongzhang
 */
import java.util.*;
public class No1403 {
    public List<Integer> minSubsequence(int[] nums) {
        List<Integer> ans= new ArrayList();
        Arrays.sort(nums);
        int sum=0;
        for(int n:nums){
            sum+=n;
        }
        int total=0;
        for(int i=nums.length-1;i>=0;i--){
            total+=nums[i];
            ans.add(nums[i]);
            if(sum-total<total)
                break;
        }
        return ans;
    }
}

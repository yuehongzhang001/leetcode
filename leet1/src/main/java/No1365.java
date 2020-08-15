
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
public class No1365 {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] map = new int[101];
        int[] copy=Arrays.copyOf(nums, nums.length);
        Arrays.sort(copy);
        for(int i=1;i<copy.length;i++){
            if(copy[i]!=copy[i-1])
                map[copy[i]]=i;
        }
        for(int i=0;i<nums.length;i++){
            nums[i]=map[nums[i]];
        }
        return nums;
    }
}

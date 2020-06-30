/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author yuehongzhang
 */
import java.util.HashSet;
public class No219 {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashSet<Integer> set = new HashSet();
        for(int i=0;i<=k&&i<nums.length;i++){
            if(!set.add(nums[i]))
                return true;
        }
        for(int i=k+1;i<nums.length;i++){
            set.remove(nums[i-k-1]);
            if(!set.add(nums[i]))
                return true;
        }
        return false;
    }
}

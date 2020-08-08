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
public class No581 {
    public int findUnsortedSubarray(int[] nums) {
        int[] copy = Arrays.copyOf(nums, nums.length);
        Arrays.sort(copy);
        int low=0;
        while(low<nums.length && copy[low]==nums[low])
            low++;
        int high=nums.length-1;
        while(high>=low && copy[high]==nums[high])
            high--;
        return high-low+1;
    }
    
    public int findUnsortedSubarray1(int[] nums){
        if(nums.length==0) return 0;
        Stack<Integer> stack = new Stack();
        stack.add(0);
        int i=1;
        while(i<nums.length && nums[stack.peek()]<=nums[i]){
            stack.add(i++);
        }
        for(;i<nums.length;i++){
            while(!stack.isEmpty() && nums[stack.peek()]>nums[i])
                stack.pop();
        }
        int low = stack.isEmpty()?0:stack.pop()+1;
        if(low==nums.length) return low;
        stack.clear();
        stack.add(nums.length-1);
        int j=nums.length-2;
        while(j>=low && nums[stack.peek()]>=nums[j])
            stack.add(j--);
        for(;j>=low;j--){
            while(!stack.isEmpty() && nums[stack.peek()]<nums[j])
                stack.pop();
        }
        int high = stack.isEmpty()?nums.length-1:stack.pop()-1;
        return high-low+1;
    }
    
    public int findUnsortedSubarray2(int[] nums){
        Stack<Integer> stack = new Stack();
        int l=nums.length;
        int r=0;
        for(int i=0;i<nums.length;i++){
            while(!stack.isEmpty() && nums[stack.peek()]>nums[i])
                l=Math.min(l, stack.pop());
            stack.push(i);
        }
        for(int i=nums.length-1;i>=0;i--){
            while(!stack.isEmpty() && nums[stack.peek()]<nums[i])
                r = Math.max(r, stack.pop());
            stack.push(i);
        }
        return r-l>0?r-l+1:0;
    }
}

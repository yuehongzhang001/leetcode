/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author yuehongzhang
 */
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Stack;
public class No169 {
    public int majorityElement(int[] nums) {
         HashMap<Integer, Integer> map = new HashMap();
         for(int i=0;i<nums.length;i++){
             int num = nums[i];
             if(map.containsKey(num))
                 map.put(num, map.get(num)+1);
             else
                 map.put(num,0);
         }
         for(Entry<Integer,Integer> e:map.entrySet()){
             if(e.getValue()>nums.length/2)
                 return e.getKey();
         }
         return nums[0];
             
    }
    
    public int majorityElement1(int[] nums){
        Stack<Integer> stack = new Stack();
        for(int i=0;i<nums.length;i++){
            if(stack.isEmpty()||stack.peek()==nums[i])
                stack.push(nums[i]);
            else
                stack.pop();
        }
        return stack.pop();
        
    }
    public int majorityElement2(int[] nums){
        Integer candidate=null;
        int count=0;
        for(int i=0;i<nums.length;i++){
            if(count==0)
                candidate=nums[i];
            else
                count=nums[i]==candidate?count+1:count-1;
        }
        return candidate;
    }
    
}

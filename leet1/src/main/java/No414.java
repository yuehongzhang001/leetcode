/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author yuehongzhang
 */
import java.util.LinkedList;
public class No414 {
    public int thirdMax(int[] nums) {
        Integer first = nums[0];
        Integer second = null;
        Integer third = null;
        for(int i=1;i<nums.length;i++){
            if(nums[i]>first){
                third = second;
                second = first;
                first = nums[i];
            }else if(nums[i]<first){
                if(second==null || nums[i]>second){
                    third = second;
                    second = nums[i];
                }else if(nums[i]<second){
                    if(third==null ||nums[i]>third)
                        third = nums[i];
                } 
            }
        }
        return  third==null?first:third;
    }
}



/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author yuehongzhang
 */
import java.util.ArrayList;
import java.util.LinkedHashMap;
public class Driver {
    public static void main(String[] args){
        int[] nums1 = {4,1,2};
        int[] nums2 = {1,3,4,2};
        int[] nums = No496.nextGreaterElement(nums1, nums2);
        for(int i:nums){
            System.out.print(i+",");
        }
    }
    
    
}

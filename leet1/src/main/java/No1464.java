
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
public class No1464 {
    public int maxProduct(int[] nums) {
        Arrays.sort(nums);
        int len=nums.length;
        return (nums[len-1]-1)*(nums[len-2]-1);
    }
    public int maxProduct1(int[] nums){
        int max1=1;
        int max2=1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>max1){
                max1=nums[i];
                max2=max1;
            }else if(nums[i]==max1){
                max2=nums[i];
            }
            else if(nums[i]>max2){
                max2=nums[i];
            }   
        }
        return (max2-1)*(max1-1);
    }
}

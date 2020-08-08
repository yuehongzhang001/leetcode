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
public class No628 {
    public int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        int len = nums.length;
        return Math.max(nums[len-1]*nums[len-2]*nums[len-3],  nums[0]*nums[1]*nums[len-1]);
    }
    
    public int maximumProduct1(int[] nums){
        int max1=Integer.MIN_VALUE,max2=Integer.MIN_VALUE,max3=Integer.MIN_VALUE;
        int min1 = Integer.MAX_VALUE,min2 = Integer.MIN_VALUE;
        for(int n:nums){
            if(max1<=n){
                max3=max2;
                max2=max1;
                max1=n;
            }else if(max2<=n){
                max3=max2;
                max2=n;
            }else if(max3<n){
                max3=n;
            }
            if(min1>=n){
                min2=min1;
                min1=n;
            }else if(min2>=n){
                min2=n;
            }
        }
        return Math.max(max3*max2*max1, min2*min1*max1);
    }
}

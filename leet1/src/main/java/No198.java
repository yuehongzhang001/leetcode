/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author yuehongzhang
 */
public class No198 {
    
    public int rob(int[] nums) {
        if(nums.length==0) return 0;
        if(nums.length==1) return nums[0];
        if(nums.length==2) return Math.max(nums[0], nums[1]);
        int fn2=nums[0];
        int fn1=Math.max(nums[0], nums[1]);
        for(int i=2;i<nums.length;i++){
            int fn=Math.max(fn2+nums[i], fn1);
            fn2=fn1;
            fn1=fn;  
        }
        return fn1;
    }
    
    public static int add(int a,int b){        
        return a+b;
    }
    
}

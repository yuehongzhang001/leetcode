/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author yuehongzhang
 */
public class No189 {
    public void rotate(int[] nums, int k) {
        for(int i=0;i<k;i++){
            int temp=nums[nums.length-1];
            for(int j=nums.length-1;j>0;j--){
                nums[j]=nums[j-1];
            }
            nums[0]=temp;
        }
    }
    public void rotate1(int[] nums, int k){
        if(nums.length==0) return;
        int prev=nums[0];
        int len=nums.length;
        int index=k;
        for(int i=0;i<len;i++){
            int current=nums[(index)%len];
            nums[(k)%len]=prev;
            prev=current;
            index+=k;
        }
    }
    
    public void rotate2(int[] nums, int k){
        int len=nums.length;
        int count=0;
        for(int start=0;count<len;start++){
            int current=start;
            int prev=nums[current];
            do{
                current=(current+k)%len;
                int temp=nums[current];
                nums[current]=prev;
                prev=temp;
                count++;
            }while(current!=start);
        }
    }
    
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author yuehongzhang
 */
public class No11 {
    public int maxArea(int[] height) {
        int ans=0;
        int len=height.length;
        for(int i=0;i<len-1;i++){
            for(int j=i+1;j<len;j++){
                ans=Math.max(ans, Math.min(height[i], height[j])*(j-i));
            }
        }
        return ans;
    }
    public int maxArea1(int[] height){
        int l=0;
        int r=height.length-1;
        int ans=0;
        while(l<r){
            ans=Math.max(ans, (r-l)*Math.min(height[l], height[r]));
            if(height[l]<height[r])
                l++;
            else if(height[l]>height[r])
                r--;
            else{
                l++;r--;
            }
                
        }
        return ans;
    }
}

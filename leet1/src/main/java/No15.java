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
public class No15 {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ans = new ArrayList();
        Arrays.sort(nums);
        int len=nums.length;
        HashSet<String> set = new HashSet();
        for(int i=0;i<len;i++){
            int l=i+1;
            int r=len-1;
            while(l<r){
                if(nums[l]+nums[r]+nums[i]==0){
                    List<Integer> tmp = new ArrayList();
                    ans.add(tmp);
                    tmp.add(nums[i]);
                    tmp.add(nums[l]);
                    tmp.add(nums[r]);
                    
                    while(l<r && nums[l]==nums[l+1]) l++;
                    l++;
                    while(l<r && nums[r]==nums[r-1]) r--;
                    r--;
                    while(i<len-1 && nums[i]==nums[i+1]) i++;
                }else if(nums[l]+nums[r]+nums[i]>0){
                    r--;
                }else
                    l++;
            }
        }
        return ans;
        
    }
    public List<List<Integer>> threeSum1(int[] nums){
        List<List<Integer>> ans = new ArrayList();
        Arrays.sort(nums);
        int len=nums.length;
        for(int i=0;i<len;i++){
            if(nums[i]>0) break;
            if(i>0 && nums[i]==nums[i-1]) continue;
            int l=i+1;
            int r=len-1;
            while(l<r){
                if(nums[l]+nums[r]+nums[i]==0){
                    List<Integer> tmp = new ArrayList();
                    tmp.add(nums[i]);tmp.add(nums[l]);tmp.add(nums[r]);
                    ans.add(tmp);
                    l++;
                    r--;
                    while(l<r && nums[l]==nums[l-1]) l++;
                    while(l<r && nums[r]==nums[r+1]) r--;
                }else if(nums[l]+nums[r]+nums[i]<0){
                    l++;
                }else
                    r--;
            }
        }
        return ans;
    }
}

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
import java.util.Map.Entry;
public class No506 {
    public String[] findRelativeRanks(int[] nums) {
        String[] res = new String[nums.length];
        
        HashMap<Integer,Integer> map = new HashMap();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i], i);
        }
        Arrays.sort(nums);
        int j=1;
        for(int i=nums.length-1;i>=0;i--){
            int index = map.get(nums[i]);
            if(j==1)
                res[index]="Gold Medal";
            else if(j==2)
                res[index]="Silver Medal";
            else if(j==3)
                res[index]="Bronze Medal";
            else
                res[index]=String.valueOf(j);
            j++;
        }
        return res;
    }
    public String[] findRelativeRanks1(int[] nums) {
        String[] res = new String[nums.length];
        
        HashMap<Integer,Integer> map = new HashMap();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i], i);
        }
        int j=1;
        for(Entry<Integer,Integer> e:map.entrySet()){
            int index = e.getValue();
            if(j==1)
                res[index]="Gold Medal";
            else if(j==2)
                res[index]="Silver Medal";
            else if(j==3)
                res[index]="Bronze Medal";
            else
                res[index]=String.valueOf(j);
            j++;
        }
        return res;
    }
}

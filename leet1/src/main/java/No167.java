/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author yuehongzhang
 */
public class No167 {
    public int[] twoSum(int[] numbers, int target) {
        
        for(int i=0;i<numbers.length-1;i++){
            int low = numbers[i];
            for(int j=i+1;j<numbers.length;j++){
                int high=numbers[j];
                if(low+high==target)
                    return new int[]{i,j};
                else if(low+high>target)
                    break;
            }
        }
        return new int[]{};
    }
    public int[] twoSum1(int[] numbers, int target){
        int low=0;
        int high=numbers.length;
        while(low<high){
            int sum = numbers[low]+numbers[high];
            if(sum==target)
                return new int[]{low+1,high+1};
            else if(sum<target)
                low++;
            else
                high--;
        }
        return new int[]{-1,-1};
    }
}

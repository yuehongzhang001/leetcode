/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author yuehongzhang
 */
public class S11 {
    public int minArray(int[] numbers) {
        for(int i=numbers.length-1;i>0;i--){
            if(numbers[i]<numbers[i-1])
                return numbers[i];
        }
        return numbers[0];
    }
    
    public int minArray1(int[] numbers) {
        int low=0;
        int high=numbers.length-1;
        while(low<=high){
            int mid = (low+high)/2;
            if(numbers[mid]<=numbers[mid+1])
                high=mid-1;
            else
                low=mid+1;
        }
        return numbers[low];
    }
}

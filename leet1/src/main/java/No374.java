/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author yuehongzhang
 */
public class No374 {
    
    int guess(int num){
        return 0;
    }
    
    public int guessNumber(int n) {
        int low = 1;
        int high = n;
        while(low<=high){
            int mid = low+(high-low)/2;
            int value = guess(mid);
            if(value==0)
                return mid;
            else if(value==-1)
                high = mid-1;
            else
                low = low+1;
        }
        return -1;
    }
}

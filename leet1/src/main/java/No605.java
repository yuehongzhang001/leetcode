/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author yuehongzhang
 */
public class No605 {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int count=0;
        for(int i=0;i<flowerbed.length;){
            if(flowerbed[i]==0){
                if((i==0 ||flowerbed[i-1]==0)&&(i==flowerbed.length-1 || flowerbed[i+1]==0)){
                    count++;
                    i+=2;
                    if(count>=n) return true;
                }else
                    i++;
            }else
                i++;
        }
        return count>=n;
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author yuehongzhang
 */
public class No1103 {
    public int[] distributeCandies(int candies, int num_people) {
        int[] ans = new int[num_people];
        int i=0;
        while(candies!=0){
            int candy = candies-i-1>=0?i+1:candies;
            candies=candies-candy;
            ans[i%num_people]+=candy;
            i++;
        }
        return ans;
    }
}

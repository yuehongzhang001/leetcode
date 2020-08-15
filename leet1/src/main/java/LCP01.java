/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author yuehongzhang
 */
public class LCP01 {
    public int game(int[] guess, int[] answer) {
        int ans=0;
        for(int i=0;i<guess.length;i++)
            if(guess[i]==answer[i])
                ans++;
        return ans;
    }
}

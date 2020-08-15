/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author yuehongzhang
 */
public class No1422 {
    public int maxScore(String s) {
        int total1=0;
        for(char c:s.toCharArray()){
            if(c=='1')
                total1++;
        }
        int max=0;
        int current0=0;
        for(int i=0;i<s.length()-1;i++){
            char c=s.charAt(i);
            if(c=='0')
                current0++;
            else
                total1--;
            max=Math.max(max, total1+current0);
        }
        return max;
    }
}

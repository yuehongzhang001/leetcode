/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author yuehongzhang
 */
public class No868 {
    public int binaryGap(int N) {
        String s=Integer.toBinaryString(N);
        int prev=-1;
        int max=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='1'){
                if(prev!=-1)
                    max=Math.max(max, i-prev);
                prev=i;
            } 
        }
        return max;
    }
}

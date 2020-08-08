/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author yuehongzhang
 */
public class No1009 {
    public int bitwiseComplement(int N) {
        String s=Integer.toBinaryString(N);
        int ans=0;
        for(int i=0;i<s.length();i++){
            int n=Math.abs(s.charAt(i)-'0'-1);
            ans=ans*2+n;
        }
        return ans;
    }
}

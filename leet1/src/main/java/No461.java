/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author yuehongzhang
 */
public class No461 {
    public int hammingDistance(int x, int y) {
        String s1=Integer.toBinaryString(x);
        String s2=Integer.toBinaryString(y);
        int ans=0;
        for(int i=0;i<32;i++){
            ans+=s1.charAt(i)==s2.charAt(i)?0:1;
        }
        return ans;
    }
}

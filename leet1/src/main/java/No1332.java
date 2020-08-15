/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author yuehongzhang
 */
public class No1332 {
    public int removePalindromeSub(String s) {
        if(s.isEmpty()) return 0;
        StringBuilder sb=new StringBuilder(s);
        sb.reverse();
        return sb.toString().equals(s)?1:2;
    }
}

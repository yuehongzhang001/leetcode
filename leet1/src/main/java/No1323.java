/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author yuehongzhang
 */
public class No1323 {
    public int maximum69Number (int num) {
        String s=String.valueOf(num);
        s.replaceFirst("6", "9");
        return Integer.parseInt(s);
    }
}

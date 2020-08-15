/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author yuehongzhang
 */
public class S50 {
    public char firstUniqChar(String s) {
        int[] fre = new int[26];
        for(char c:s.toCharArray()){
            fre[c-'a']++;
        }
        for(char c:s.toCharArray()){
            if(fre[c-'a']==1)
                return c;
        }
        return ' ';
    }
}

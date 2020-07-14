/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author yuehongzhang
 */
public class No387 {
    public int firstUniqChar(String s) {
        int[] map = new int[26];
        for(int i=0;i<s.length();i++){
            int c = s.charAt(i)-'a';
            int count = map[c];
            map[c]=count+1;
        }
        for(int i=0;i<s.length();i++){
            int c = s.charAt(i)-'a';
            if(map[c]==1)
                return i;
        }
        return -1;
    }
}

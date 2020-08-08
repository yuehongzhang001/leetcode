/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author yuehongzhang
 */
public class No1189 {
    public int maxNumberOfBalloons(String text) {
        int[] map = new int[26];
        for(char c:text.toCharArray()){
            map[c-'a']++;
        }
        int ans=1000;
        ans=Math.min(ans, map[0]);
        ans=Math.min(ans, map['b'-'a']);
        ans=Math.min(ans, map['l'-'a']/2);
        ans=Math.min(ans, map['o'-'a']/2);
        ans=Math.min(ans, map['n'-'a']);
        return ans;
    }
}

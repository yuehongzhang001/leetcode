/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author yuehongzhang
 */
import java.util.Arrays;
public class No242 {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()) return false;
         int[] times1 = new int[26];
         int[] times2 = new int[26];
         for(int i=0;i<s.length();i++){
             char c1 = Character.toLowerCase(s.charAt(i));
             times1[c1-'a']++;
             char c2 = Character.toLowerCase(t.charAt(i));
             times2[c2-'a']++;
         }
         for(int i=0;i<26;i++){
             if(times1[i]!=times2[i])
                 return false;
         }
         return true;
    }
    public boolean isAnagram1(String s, String t){
        if(s.length()!=t.length()) return false;
        char[] c1 = s.toCharArray();
        char[] c2 = t.toCharArray();
        Arrays.sort(c1);
        Arrays.sort(c2);
        for(int i=0;i<c1.length;i++){
            if(c1[i]!=c2[i])
                return false;
        }
        return true;
    }
    
}

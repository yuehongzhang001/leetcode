
import java.util.Arrays;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author yuehongzhang
 */
import java.util.HashMap;
public class No383 {
    public boolean canConstruct(String ransomNote, String magazine) {
        if(ransomNote.length()>magazine.length()) return false;
        char[] note = ransomNote.toCharArray();
        char[] mag = magazine.toCharArray();
        Arrays.sort(note);
        Arrays.sort(mag);
        int i=0,j=0;
        for(;i<note.length&&j<mag.length;){
            if(note[i]==mag[j]){
                i++;
                j++;
            }
            else if(note[i]<mag[j]){
                return false;
            }else
                j++;
        }
        return i==note.length;
    }
    
    public boolean canConstruct1(String ransomNote, String magazine){
        HashMap<Character, Integer> map = new HashMap();
        for(int i=0;i<magazine.length();i++){
            char c = magazine.charAt(i);
            int count = map.getOrDefault(c, 0);
            map.put(c, count+1);
        }
        for(int i=0;i<ransomNote.length();i++){
            char c = ransomNote.charAt(i);
            int count = map.getOrDefault(c, 0);
            if(count==0)
                return false;
            else{
                map.put(c, count-1);
            }
        }
        return true;
    }
    public boolean canConstruct2(String ransomNote, String magazine){
        int[] map = new int[26];
        for(int i=0;i<magazine.length();i++){
            char c = magazine.charAt(i);
            map[c-'a']=map[c-'a']+1;
        }
        for(int i=0;i<ransomNote.length();i++){
            char c = ransomNote.charAt(i);
            if(map[c-'a']==0)
                return false;
            else
                map[c-'a']=map[c-'a']-1;
        }
        return true;
    }
    
}

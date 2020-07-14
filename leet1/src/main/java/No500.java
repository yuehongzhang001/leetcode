/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author yuehongzhang
 */
import java.util.*;
public class No500 {
    public String[] findWords(String[] words) {
        ArrayList<String> list = new ArrayList();
        int[] map = new int[26];
        char[][] rows = {{'q','w','e','r','t','y','u','i','o','p'},{'a','s','d','f','g','h','j','k','l'},{'z','x','c','v','b','n','m'}};
        for(int i=0;i<rows.length;i++){
            for(char c:rows[i]){
                map[c-'a']=i;
            }
        }
        for(String word:words){
            boolean fault = false;
            for(int i=0;i<word.length();i++){
                if(map[Character.toLowerCase(word.charAt(i))-'a']!=map[Character.toLowerCase(word.charAt(0))-'a']){
                    fault = true;
                    break;
                }
                    
            }
            if(!fault)
                list.add(word);
        }
        String[] res = new String[list.size()];
        for(int i=0;i<res.length;i++){
            res[i]=list.get(i);
        }
        return res;
    }
}

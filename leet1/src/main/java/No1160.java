/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author yuehongzhang
 */
public class No1160 {
    public int countCharacters(String[] words, String chars) {
        int[] map =new int[26];
        int ans=0;
        for(char c:chars.toCharArray()){
            map[c-'a']++;
        }
        for(String s:words){
            int[] m=new int[26];
            for(char c:s.toCharArray())
                m[c-'a']++;
            boolean flag=true;
            for(int i=0;i<26;i++){
                if(m[i]>map[i]){
                    flag=false;
                    break;
                }
            }
            if(flag) ans+=s.length();
        }
        return ans;
    }
}

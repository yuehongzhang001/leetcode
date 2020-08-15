/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author yuehongzhang
 */
public class S1370 {
    public String sortString(String s) {
        StringBuilder sb = new StringBuilder();
        int[] map=new int[26];
        int sum=s.length();
        for(char c:s.toCharArray()){
            map[c-'a']++;
        }
        while(sum>0){
            for(int i=0;i<26;i++){
                if(map[i]!=0){
                    sb.append((char)(i+'a'));
                    map[i]--;
                    sum--;
                }  
            }
            for(int i=25;i>=0;i--){
                if(map[i]!=0){
                    sb.append((char)(i+'a'));
                    map[i]--;
                    sum--;
                }  
            }
        }
        return sb.toString();
    }
}

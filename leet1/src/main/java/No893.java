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
public class No893 {
    public int numSpecialEquivGroups(String[] A) {
        int[] m = new int[26];
        HashSet<String> set = new HashSet();
        for(String s:A){
            StringBuilder sb=new StringBuilder();
            for(int i=0;i<s.length();i+=2){
                m[s.charAt(i)-'a']++;
            }
            for(int i=0;i<26;i++){
                if(m[i]!=0){
                    sb.append((char)(i+'a'));
                    sb.append(m[i]);
                    m[i]=0;
                }
            }
            sb.append(",");
            for(int i=1;i<s.length();i+=2){
                m[s.charAt(i)-'a']++;
            }
            for(int i=0;i<26;i++){
                if(m[i]!=0){
                    sb.append((char)(i+'a'));
                    sb.append(m[i]);
                    m[i]=0;
                }
            }
            set.add(sb.toString());
        }
        return set.size();
    }
    
    public int numSpecialEquivGroups1(String[] A){
        
        HashSet<String> set = new HashSet();
        for(String s:A){
            int[] m = new int[52];
            for(int i=0;i<s.length();i++){
                char c=s.charAt(i);
                m[c-'a'+i%2*26]++;
            }
            set.add(Arrays.toString(m));
        }
        return set.size();
    }
}

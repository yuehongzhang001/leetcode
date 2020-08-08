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
public class No720 {
    public String longestWord(String[] words) {
        HashSet<String> set = new HashSet();
        Arrays.sort(words,new Comparator<String>(){
            public int compare(String s1,String s2){
                return s1.length()-s2.length();
            }
        });
        String res="";
        for(String s:words){
            if(s.length()<=1 || set.contains(s.substring(0,s.length()-1))){
                set.add(s);
                if(s.length()>res.length() || (s.length()==res.length() && s.compareTo(res)<0))
                    res=s;
            }
        }
        return res;
    }
}

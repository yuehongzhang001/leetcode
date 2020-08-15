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
public class No1408 {
    public List<String> stringMatching(String[] words) {
        List<String> ans = new ArrayList();
        for(int i=0;i<words.length;i++){
            for(int j=0; j<words.length;j++){
                if(i!=j && words[j].indexOf(words[i])!=-1){
                    ans.add(words[i]);
                    break;
                }
            }
        }
        return ans;
    }
    public List<String> stringMatching1(String[] words){
        List<String> ans = new ArrayList();
        String s=String.join(",", words);
        for(String word:words){
            if(s.indexOf(word)!=s.lastIndexOf(word)) ans.add(word);
        }
        return ans;
    }
}

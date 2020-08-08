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
public class No804 {
    public int uniqueMorseRepresentations(String[] words) {
        String[] trans = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        HashSet<String> set =new HashSet();
        for(String w:words){
            StringBuilder sb = new StringBuilder();
            for(char c:w.toCharArray()){
                sb.append(trans[c-'a']);
            }
            set.add(sb.toString());
        }
        return set.size();
    }
}

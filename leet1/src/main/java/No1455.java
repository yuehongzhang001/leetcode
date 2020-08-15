/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author yuehongzhang
 */
public class No1455 {
    public int isPrefixOfWord(String sentence, String searchWord) {
        String[] ss = sentence.split(" ");
        for(int i=0;i<ss.length;i++){
            if(ss[i].indexOf(searchWord)==0)
                return i+1;
        }
        return -1;
    }
}

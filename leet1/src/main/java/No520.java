/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author yuehongzhang
 */
public class No520 {
    public boolean detectCapitalUse(String word) {
        if(Character.isUpperCase(word.charAt(0))){
            for(int i=1;i<word.length()-1;i++){
                if(Character.isUpperCase(word.charAt(i))!=Character.isUpperCase(word.charAt(i+1)))
                    return false;
            }
        }else{
            for(int i=1;i<word.length();i++){
                if(Character.isUpperCase(word.charAt(i)))
                    return false;
            }
        }
        return true;
            
    }
}

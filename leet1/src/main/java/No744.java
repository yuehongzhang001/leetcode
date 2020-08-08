/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author yuehongzhang
 */
public class No744 {
    public char nextGreatestLetter(char[] letters, char target) {
        for(int i=0;i<letters.length;i++){
            if(letters[i]>target)
                return letters[i];
        }
        return letters[0];
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author yuehongzhang
 */
public class No344 {
    public void reverseString(char[] s) {
        for(int i=0,j=s.length-1;i<j;i++,j--){
            char temp = s[i];
            s[i]=s[j];
            s[j]=temp;
        }
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author yuehongzhang
 */
public class No1528 {
     public String restoreString(String s, int[] indices) {
         char[] chs= new char[s.length()];
         for(int i=0;i<indices.length;i++){
             chs[indices[i]]=s.charAt(i);
         }
         return String.valueOf(chs);
    }
}

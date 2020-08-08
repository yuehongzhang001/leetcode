/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author yuehongzhang
 */
public class No709 {
    public String toLowerCase(String str) {
        return str.toLowerCase();
    }
    public String toLowerCase1(String str){
        char[] chs = str.toCharArray();
        for(int i=0;i<chs.length;i++){
            if(chs[i]>='A' &&chs[i]<='Z')
                chs[i]=(char)(chs[i]-'A'+'a');
        }
        return String.valueOf(chs);
    }
}

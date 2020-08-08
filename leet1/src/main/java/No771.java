/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author yuehongzhang
 */
public class No771 {
    public int numJewelsInStones(String J, String S) {
        int[] map = new int[52];
        for(int i=0;i<J.length();i++){
            char c=J.charAt(i);
            if(c>='a' && c<='z')
                map[c-'a']=1;
            else
                map[c-'A'+26]=1;
        }
        int res=0;
        for(int i=0;i<S.length();i++){
            char c=S.charAt(i);
            if(c>='a' && c<='z')
                res+=map[c-'a'];
            else 
                res+=map[c-'A'+26];
        }
        return res;
    }
}

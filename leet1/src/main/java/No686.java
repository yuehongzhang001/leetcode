/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author yuehongzhang
 */
public class No686 {
    public int repeatedStringMatch(String A, String B) {
        int lenA = A.length();
        int lenB = B.length();
        String s = A;
        for(int i=1;i<=lenB/lenA+1;i++){
            if(s.indexOf(B)!=-1)
                return i;
            s+=A;
        }
        return -1;
    }
}

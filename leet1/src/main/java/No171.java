/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author yuehongzhang
 */
public class No171 {
    public int titleToNumber(String s) {
        int sum=0;
        for(int i=0;i<s.length();i++){
            int n = s.charAt(i)-'A'+1;
            sum=sum*26+n;
        }
        return sum;
    }
}

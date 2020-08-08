/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author yuehongzhang
 */
public class No806 {
    public int[] numberOfLines(int[] widths, String S) {
        int row=1;
        int rowC = 0;
        for(int i=0;i<S.length();i++){
            char c=S.charAt(i);
            if(rowC+widths[c-'a']<=100)
                rowC+=widths[c-'a'];
            else{
                rowC=widths[c-'a'];
                row++;
            }
        }
        return new int[]{row,rowC};
    }
}

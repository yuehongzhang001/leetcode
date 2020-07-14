/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author yuehongzhang
 */
public class No557 {
    public String reverseWords(String s) {
        char[] chs = s.toCharArray();
        for(int i=0;i<chs.length;i++){
            while(i<chs.length && chs[i]==' ')
                i++;
            int low = i;
            while(i<chs.length && chs[i]!=' ')
                i++;
            int high = i-1;
            while(low<high){
                char tmp = chs[high];
                chs[high]= chs[low];
                chs[low] = tmp;
                low++;
                high--;
            }
        }
        return String.valueOf(chs);
    }
    
}

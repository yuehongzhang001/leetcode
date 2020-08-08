/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author yuehongzhang
 */
public class No917 {
    public String reverseOnlyLetters(String S) {
        char[] chs = S.toCharArray();
        int low = 0;
        for(int i=S.length()-1;i>=0;i--){
            char c=S.charAt(i);
            if(Character.isAlphabetic(c)){
                while(low<S.length() && !Character.isAlphabetic(chs[low]))
                    low++;
                chs[low++]=c;
            }
        }
        return String.valueOf(chs);
    }
    
    public String reverseOnlyLetters1(String S){
        StringBuilder sb = new StringBuilder();
        int j=S.length()-1;
        for(int i=0;i<S.length();i++){
            if(Character.isAlphabetic(S.charAt(i))){
                while(!Character.isAlphabetic(S.charAt(j))){
                    j--;
                }
                sb.append(S.charAt(j--));
            }else{
                sb.append(S.charAt(i));
            }
        }
        return sb.toString();
    }
}

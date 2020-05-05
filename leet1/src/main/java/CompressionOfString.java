/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author yuehongzhang
 */
public class CompressionOfString {

    public static String compressString(String S) {
        if(S.equals("")) return "";
        StringBuilder result =new StringBuilder();
        char prevC=S.charAt(0);
        result.append(prevC);
        int count=1;
        for(int i=1;i<S.length(); i++){
            char c = S.charAt(i);
            if(c==prevC){
                count++;
            }else{
                result.append(count);
                count=1;
                result.append(c);
                prevC=c;      
            }
            
        }
        result.append(count);
        //check if the compression is necessary

       return result.length()>=S.length()?S:result.toString();
    }
}

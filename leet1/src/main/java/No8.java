/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author yuehongzhang
 */
public class No8 {
    public static int myAtoi(String str) {
        if(str.length()==0) return 0; 
        char[] ch=str.toCharArray();
        int len=ch.length;
        boolean positive=true;
        int result=0;
        int j=0;
        while(j<len && ch[j]==' '){
            j++;
        }
        if(j==len){
            return 0;
        }else{
            if(ch[j]=='-'){
                positive=false;
                j++;
            }else if(ch[j]=='+'){
                j++;
            }
        }
        
        
        if(j<len && ch[j]<='9'&&ch[j]>='0'){
            
            while(j<len && ch[j]<='9'&&ch[j]>='0'){
                int digit=ch[j]-'0';
                if(result>(Integer.MAX_VALUE-digit)/10){
                    return positive==true?Integer.MAX_VALUE:Integer.MIN_VALUE;
                }
                
                result=result*10+digit;
                
                j++;
            }
            return positive?result:(-result);
        }else{
            return 0;
        }
        
    }
}

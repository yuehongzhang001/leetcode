/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author yuehongzhang
 */
public class No67 {
    public static String addBinary(String a, String b) {
        int flag=0;
        int aLen=a.length();
        int bLen=b.length();
        String shortStr;
        String longStr;
        int sLen, lLen;
        if(aLen<bLen){
            shortStr=a;
            longStr=b;
            sLen = aLen;
            lLen = bLen;
        }else{
            shortStr=b;
            longStr=a;
            sLen = bLen;
            lLen = aLen;
        }
        StringBuilder sb = new StringBuilder();
        for(int i=lLen-1;i>=0;i--){
            if(i>=lLen-sLen){
                int sum = longStr.charAt(i)-'0'+shortStr.charAt(i-lLen+sLen)-'0'+flag;
                if(sum<2){
                    flag=0;
                    sb.append(sum);
                }else{
                    flag=1;
                    sb.append(sum-2);
                }
            }else{
                int sum = longStr.charAt(i)-'0'+flag;
                if(sum<2){
                    flag=0;
                    sb.append(sum);
                }else{
                    flag=1;
                    sb.append(0);
                }
            }
                
        }
        if(flag==1) sb.append(1);
        return sb.reverse().toString();
        
    }

    
}
